/*******************************************************************************
 * Copyright (C) 2005-2017 Alfresco Software Limited.
 * 
 * This file is part of the Alfresco Mobile SDK.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 ******************************************************************************/
package org.alfresco.mobile.android.api.session.authentication;

import java.io.Serializable;

/**
 * Class to embed informations about SAML context.
 * 
 * @author Jean Marie Pascal
 */
public interface SamlInfo extends Serializable
{
    /**
     * Returns true is SAML has been activated on Alfresco server.
     */
    Boolean isSamlEnabled();

    /**
     * Returns true is SAML has been enforced on Alfresco server.
     */
    Boolean isSamlEnforced();

    /**
     * Returns the description information as defined in Alfresco SAML Console.
     */
    String getIdpDescription();

    /**
     * Returns the tenant domain
     */
    String getTenantDomain();
}
