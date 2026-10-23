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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetUserKeyListRequest extends AbstractModel {

    /**
    * <p>环境ID</p>
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * <p>分页的offset，从0开始</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页的每页多少条</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>根据集成名称模糊查询，name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>集成类型映射码</p>
    */
    @SerializedName("AuthTypeCode")
    @Expose
    private String AuthTypeCode;

    /**
    * <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
     * Get <p>环境ID</p> 
     * @return EnvId <p>环境ID</p>
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set <p>环境ID</p>
     * @param EnvId <p>环境ID</p>
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get <p>分页的offset，从0开始</p> 
     * @return Offset <p>分页的offset，从0开始</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页的offset，从0开始</p>
     * @param Offset <p>分页的offset，从0开始</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页的每页多少条</p> 
     * @return Limit <p>分页的每页多少条</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页的每页多少条</p>
     * @param Limit <p>分页的每页多少条</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>根据集成名称模糊查询，name</p> 
     * @return Name <p>根据集成名称模糊查询，name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>根据集成名称模糊查询，name</p>
     * @param Name <p>根据集成名称模糊查询，name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>集成类型映射码</p> 
     * @return AuthTypeCode <p>集成类型映射码</p>
     */
    public String getAuthTypeCode() {
        return this.AuthTypeCode;
    }

    /**
     * Set <p>集成类型映射码</p>
     * @param AuthTypeCode <p>集成类型映射码</p>
     */
    public void setAuthTypeCode(String AuthTypeCode) {
        this.AuthTypeCode = AuthTypeCode;
    }

    /**
     * Get <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p> 
     * @return Business <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * Set <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     * @param Business <p>业务类型，integration：从集成中心来的，默认为空，表示是从授权管理中心来的</p>
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    public GetUserKeyListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetUserKeyListRequest(GetUserKeyListRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AuthTypeCode != null) {
            this.AuthTypeCode = new String(source.AuthTypeCode);
        }
        if (source.Business != null) {
            this.Business = new String(source.Business);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AuthTypeCode", this.AuthTypeCode);
        this.setParamSimple(map, prefix + "Business", this.Business);

    }
}

