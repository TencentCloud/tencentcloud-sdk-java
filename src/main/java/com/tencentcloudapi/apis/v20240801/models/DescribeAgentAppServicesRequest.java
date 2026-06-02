/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentAppServicesRequest extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * <p>数据量</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>IDs</p>
    */
    @SerializedName("IDs")
    @Expose
    private String [] IDs;

    /**
    * <p>应用IDs</p>
    */
    @SerializedName("AgentAppIDs")
    @Expose
    private String [] AgentAppIDs;

    /**
    * <p>服务IDs</p>
    */
    @SerializedName("ServiceIDs")
    @Expose
    private String [] ServiceIDs;

    /**
    * <p>关键字</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * <p>偏移量</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>是否有凭据</p>
    */
    @SerializedName("AgentCredentialExist")
    @Expose
    private Boolean AgentCredentialExist;

    /**
    * <p>凭据ID</p>
    */
    @SerializedName("AgentCredentialIDs")
    @Expose
    private String [] AgentCredentialIDs;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceID <p>实例ID</p>
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceID <p>实例ID</p>
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get <p>数据量</p> 
     * @return Limit <p>数据量</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>数据量</p>
     * @param Limit <p>数据量</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>IDs</p> 
     * @return IDs <p>IDs</p>
     */
    public String [] getIDs() {
        return this.IDs;
    }

    /**
     * Set <p>IDs</p>
     * @param IDs <p>IDs</p>
     */
    public void setIDs(String [] IDs) {
        this.IDs = IDs;
    }

    /**
     * Get <p>应用IDs</p> 
     * @return AgentAppIDs <p>应用IDs</p>
     */
    public String [] getAgentAppIDs() {
        return this.AgentAppIDs;
    }

    /**
     * Set <p>应用IDs</p>
     * @param AgentAppIDs <p>应用IDs</p>
     */
    public void setAgentAppIDs(String [] AgentAppIDs) {
        this.AgentAppIDs = AgentAppIDs;
    }

    /**
     * Get <p>服务IDs</p> 
     * @return ServiceIDs <p>服务IDs</p>
     */
    public String [] getServiceIDs() {
        return this.ServiceIDs;
    }

    /**
     * Set <p>服务IDs</p>
     * @param ServiceIDs <p>服务IDs</p>
     */
    public void setServiceIDs(String [] ServiceIDs) {
        this.ServiceIDs = ServiceIDs;
    }

    /**
     * Get <p>关键字</p> 
     * @return Keyword <p>关键字</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>关键字</p>
     * @param Keyword <p>关键字</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get <p>偏移量</p> 
     * @return Offset <p>偏移量</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量</p>
     * @param Offset <p>偏移量</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>是否有凭据</p> 
     * @return AgentCredentialExist <p>是否有凭据</p>
     */
    public Boolean getAgentCredentialExist() {
        return this.AgentCredentialExist;
    }

    /**
     * Set <p>是否有凭据</p>
     * @param AgentCredentialExist <p>是否有凭据</p>
     */
    public void setAgentCredentialExist(Boolean AgentCredentialExist) {
        this.AgentCredentialExist = AgentCredentialExist;
    }

    /**
     * Get <p>凭据ID</p> 
     * @return AgentCredentialIDs <p>凭据ID</p>
     */
    public String [] getAgentCredentialIDs() {
        return this.AgentCredentialIDs;
    }

    /**
     * Set <p>凭据ID</p>
     * @param AgentCredentialIDs <p>凭据ID</p>
     */
    public void setAgentCredentialIDs(String [] AgentCredentialIDs) {
        this.AgentCredentialIDs = AgentCredentialIDs;
    }

    public DescribeAgentAppServicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentAppServicesRequest(DescribeAgentAppServicesRequest source) {
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.IDs != null) {
            this.IDs = new String[source.IDs.length];
            for (int i = 0; i < source.IDs.length; i++) {
                this.IDs[i] = new String(source.IDs[i]);
            }
        }
        if (source.AgentAppIDs != null) {
            this.AgentAppIDs = new String[source.AgentAppIDs.length];
            for (int i = 0; i < source.AgentAppIDs.length; i++) {
                this.AgentAppIDs[i] = new String(source.AgentAppIDs[i]);
            }
        }
        if (source.ServiceIDs != null) {
            this.ServiceIDs = new String[source.ServiceIDs.length];
            for (int i = 0; i < source.ServiceIDs.length; i++) {
                this.ServiceIDs[i] = new String(source.ServiceIDs[i]);
            }
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.AgentCredentialExist != null) {
            this.AgentCredentialExist = new Boolean(source.AgentCredentialExist);
        }
        if (source.AgentCredentialIDs != null) {
            this.AgentCredentialIDs = new String[source.AgentCredentialIDs.length];
            for (int i = 0; i < source.AgentCredentialIDs.length; i++) {
                this.AgentCredentialIDs[i] = new String(source.AgentCredentialIDs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "IDs.", this.IDs);
        this.setParamArraySimple(map, prefix + "AgentAppIDs.", this.AgentAppIDs);
        this.setParamArraySimple(map, prefix + "ServiceIDs.", this.ServiceIDs);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "AgentCredentialExist", this.AgentCredentialExist);
        this.setParamArraySimple(map, prefix + "AgentCredentialIDs.", this.AgentCredentialIDs);

    }
}

