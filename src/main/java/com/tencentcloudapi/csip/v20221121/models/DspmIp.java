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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspmIp extends AbstractModel {

    /**
    * ip地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * ip类型。public-公网 private-内网
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

    /**
    * ip标记信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 是否已经标记信息
    */
    @SerializedName("IsRemarked")
    @Expose
    private Long IsRemarked;

    /**
    * ip归属实例id
    */
    @SerializedName("ResourceInstanceId")
    @Expose
    private String ResourceInstanceId;

    /**
    * ip所属产品
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * ip所属地域
    */
    @SerializedName("Area")
    @Expose
    private DspmArea Area;

    /**
    * 是否新ip地址
    */
    @SerializedName("IsNewIp")
    @Expose
    private Long IsNewIp;

    /**
     * Get ip地址 
     * @return Ip ip地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set ip地址
     * @param Ip ip地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get ip类型。public-公网 private-内网 
     * @return IpType ip类型。public-公网 private-内网
     */
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set ip类型。public-公网 private-内网
     * @param IpType ip类型。public-公网 private-内网
     */
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    /**
     * Get ip标记信息 
     * @return Remark ip标记信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set ip标记信息
     * @param Remark ip标记信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 是否已经标记信息 
     * @return IsRemarked 是否已经标记信息
     */
    public Long getIsRemarked() {
        return this.IsRemarked;
    }

    /**
     * Set 是否已经标记信息
     * @param IsRemarked 是否已经标记信息
     */
    public void setIsRemarked(Long IsRemarked) {
        this.IsRemarked = IsRemarked;
    }

    /**
     * Get ip归属实例id 
     * @return ResourceInstanceId ip归属实例id
     */
    public String getResourceInstanceId() {
        return this.ResourceInstanceId;
    }

    /**
     * Set ip归属实例id
     * @param ResourceInstanceId ip归属实例id
     */
    public void setResourceInstanceId(String ResourceInstanceId) {
        this.ResourceInstanceId = ResourceInstanceId;
    }

    /**
     * Get ip所属产品 
     * @return ResourceType ip所属产品
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set ip所属产品
     * @param ResourceType ip所属产品
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get ip所属地域 
     * @return Area ip所属地域
     */
    public DspmArea getArea() {
        return this.Area;
    }

    /**
     * Set ip所属地域
     * @param Area ip所属地域
     */
    public void setArea(DspmArea Area) {
        this.Area = Area;
    }

    /**
     * Get 是否新ip地址 
     * @return IsNewIp 是否新ip地址
     */
    public Long getIsNewIp() {
        return this.IsNewIp;
    }

    /**
     * Set 是否新ip地址
     * @param IsNewIp 是否新ip地址
     */
    public void setIsNewIp(Long IsNewIp) {
        this.IsNewIp = IsNewIp;
    }

    public DspmIp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspmIp(DspmIp source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.IpType != null) {
            this.IpType = new String(source.IpType);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.IsRemarked != null) {
            this.IsRemarked = new Long(source.IsRemarked);
        }
        if (source.ResourceInstanceId != null) {
            this.ResourceInstanceId = new String(source.ResourceInstanceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.Area != null) {
            this.Area = new DspmArea(source.Area);
        }
        if (source.IsNewIp != null) {
            this.IsNewIp = new Long(source.IsNewIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "IpType", this.IpType);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "IsRemarked", this.IsRemarked);
        this.setParamSimple(map, prefix + "ResourceInstanceId", this.ResourceInstanceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "Area.", this.Area);
        this.setParamSimple(map, prefix + "IsNewIp", this.IsNewIp);

    }
}

