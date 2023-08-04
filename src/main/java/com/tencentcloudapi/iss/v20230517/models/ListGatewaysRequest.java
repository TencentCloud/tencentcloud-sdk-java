/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListGatewaysRequest extends AbstractModel{

    /**
    * 页码，默认为1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量，默认为20
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 网关名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 服务节点ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 网关状态（0：离线，1 ：在线）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 页码，默认为1 
     * @return PageNumber 页码，默认为1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认为1
     * @param PageNumber 页码，默认为1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量，默认为20 
     * @return PageSize 每页数量，默认为20
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量，默认为20
     * @param PageSize 每页数量，默认为20
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 网关名称 
     * @return Name 网关名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 网关名称
     * @param Name 网关名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 服务节点ID 
     * @return ClusterId 服务节点ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 服务节点ID
     * @param ClusterId 服务节点ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 网关状态（0：离线，1 ：在线） 
     * @return Status 网关状态（0：离线，1 ：在线）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 网关状态（0：离线，1 ：在线）
     * @param Status 网关状态（0：离线，1 ：在线）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ListGatewaysRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGatewaysRequest(ListGatewaysRequest source) {
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

