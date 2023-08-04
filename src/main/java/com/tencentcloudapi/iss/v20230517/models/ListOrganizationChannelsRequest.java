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

public class ListOrganizationChannelsRequest extends AbstractModel{

    /**
    * 组织ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 每页最大数量
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * 第几页 
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 查询条件，则按照设备名称查询
查询条件同时只有一个生效。长度不超过32字节
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 查询条件，则按照通道名称查询
查询条件同时只有一个生效。长度不超过32字节
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
     * Get 组织ID 
     * @return OrganizationId 组织ID
     */
    public String getOrganizationId() {
        return this.OrganizationId;
    }

    /**
     * Set 组织ID
     * @param OrganizationId 组织ID
     */
    public void setOrganizationId(String OrganizationId) {
        this.OrganizationId = OrganizationId;
    }

    /**
     * Get 每页最大数量 
     * @return PageSize 每页最大数量
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页最大数量
     * @param PageSize 每页最大数量
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get 第几页  
     * @return PageNumber 第几页 
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 第几页 
     * @param PageNumber 第几页 
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 查询条件，则按照设备名称查询
查询条件同时只有一个生效。长度不超过32字节 
     * @return DeviceName 查询条件，则按照设备名称查询
查询条件同时只有一个生效。长度不超过32字节
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 查询条件，则按照设备名称查询
查询条件同时只有一个生效。长度不超过32字节
     * @param DeviceName 查询条件，则按照设备名称查询
查询条件同时只有一个生效。长度不超过32字节
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 查询条件，则按照通道名称查询
查询条件同时只有一个生效。长度不超过32字节 
     * @return ChannelName 查询条件，则按照通道名称查询
查询条件同时只有一个生效。长度不超过32字节
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 查询条件，则按照通道名称查询
查询条件同时只有一个生效。长度不超过32字节
     * @param ChannelName 查询条件，则按照通道名称查询
查询条件同时只有一个生效。长度不超过32字节
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    public ListOrganizationChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListOrganizationChannelsRequest(ListOrganizationChannelsRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);

    }
}

