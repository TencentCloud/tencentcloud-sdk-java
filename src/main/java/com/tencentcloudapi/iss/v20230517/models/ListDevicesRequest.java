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

public class ListDevicesRequest extends AbstractModel{

    /**
    * 组织ID
    */
    @SerializedName("OrganizationId")
    @Expose
    private String OrganizationId;

    /**
    * 是否获取当前层级及子层级的设备列表，默认false
    */
    @SerializedName("IsContainSubLevel")
    @Expose
    private Boolean IsContainSubLevel;

    /**
    * 设备接入协议。1:RTMP，2:GB，3:GW
    */
    @SerializedName("AccessProtocol")
    @Expose
    private Long AccessProtocol;

    /**
    * 设备类型。1:IPC，2:NVR
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 设备状态。0:未注册，1:在线，2:离线，3:禁用	
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 服务节点ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 模糊搜索设备关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
    * 当前用户Uin
    */
    @SerializedName("CurrentUin")
    @Expose
    private Long CurrentUin;

    /**
    * 页码，默认为1。
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * 每页数量，默认为20。
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

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
     * Get 是否获取当前层级及子层级的设备列表，默认false 
     * @return IsContainSubLevel 是否获取当前层级及子层级的设备列表，默认false
     */
    public Boolean getIsContainSubLevel() {
        return this.IsContainSubLevel;
    }

    /**
     * Set 是否获取当前层级及子层级的设备列表，默认false
     * @param IsContainSubLevel 是否获取当前层级及子层级的设备列表，默认false
     */
    public void setIsContainSubLevel(Boolean IsContainSubLevel) {
        this.IsContainSubLevel = IsContainSubLevel;
    }

    /**
     * Get 设备接入协议。1:RTMP，2:GB，3:GW 
     * @return AccessProtocol 设备接入协议。1:RTMP，2:GB，3:GW
     */
    public Long getAccessProtocol() {
        return this.AccessProtocol;
    }

    /**
     * Set 设备接入协议。1:RTMP，2:GB，3:GW
     * @param AccessProtocol 设备接入协议。1:RTMP，2:GB，3:GW
     */
    public void setAccessProtocol(Long AccessProtocol) {
        this.AccessProtocol = AccessProtocol;
    }

    /**
     * Get 设备类型。1:IPC，2:NVR 
     * @return Type 设备类型。1:IPC，2:NVR
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型。1:IPC，2:NVR
     * @param Type 设备类型。1:IPC，2:NVR
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 设备状态。0:未注册，1:在线，2:离线，3:禁用	 
     * @return Status 设备状态。0:未注册，1:在线，2:离线，3:禁用	
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 设备状态。0:未注册，1:在线，2:离线，3:禁用	
     * @param Status 设备状态。0:未注册，1:在线，2:离线，3:禁用	
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 模糊搜索设备关键字 
     * @return Keyword 模糊搜索设备关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 模糊搜索设备关键字
     * @param Keyword 模糊搜索设备关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Get 当前用户Uin 
     * @return CurrentUin 当前用户Uin
     */
    public Long getCurrentUin() {
        return this.CurrentUin;
    }

    /**
     * Set 当前用户Uin
     * @param CurrentUin 当前用户Uin
     */
    public void setCurrentUin(Long CurrentUin) {
        this.CurrentUin = CurrentUin;
    }

    /**
     * Get 页码，默认为1。 
     * @return PageNumber 页码，默认为1。
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set 页码，默认为1。
     * @param PageNumber 页码，默认为1。
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get 每页数量，默认为20。 
     * @return PageSize 每页数量，默认为20。
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页数量，默认为20。
     * @param PageSize 每页数量，默认为20。
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public ListDevicesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListDevicesRequest(ListDevicesRequest source) {
        if (source.OrganizationId != null) {
            this.OrganizationId = new String(source.OrganizationId);
        }
        if (source.IsContainSubLevel != null) {
            this.IsContainSubLevel = new Boolean(source.IsContainSubLevel);
        }
        if (source.AccessProtocol != null) {
            this.AccessProtocol = new Long(source.AccessProtocol);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
        if (source.CurrentUin != null) {
            this.CurrentUin = new Long(source.CurrentUin);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrganizationId", this.OrganizationId);
        this.setParamSimple(map, prefix + "IsContainSubLevel", this.IsContainSubLevel);
        this.setParamSimple(map, prefix + "AccessProtocol", this.AccessProtocol);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);
        this.setParamSimple(map, prefix + "CurrentUin", this.CurrentUin);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

