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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLicenseOrderRequest extends AbstractModel{

    /**
    * 标签数组, 空则表示不需要绑定标签
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
默认为0
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * 授权数量 , 需要购买的数量.
默认为1
    */
    @SerializedName("LicenseNum")
    @Expose
    private Long LicenseNum;

    /**
    * 购买订单地域,这里仅支持 1 广州,9 新加坡. 推荐选择广州. 新加坡地域为白名单用户购买.
默认为1
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 项目ID .
默认为0
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 购买时间长度,默认1 , 可选值为1,2,3,4,5,6,7,8,9,10,11,12,24,36
该参数仅包年包月生效
    */
    @SerializedName("TimeSpan")
    @Expose
    private Long TimeSpan;

    /**
    * 是否自动续费, 默认不自动续费.
该参数仅包年包月生效
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * 该字段作废
    */
    @SerializedName("AutoProtectOpenConfig")
    @Expose
    private String AutoProtectOpenConfig;

    /**
    * 变配参数
    */
    @SerializedName("ModifyConfig")
    @Expose
    private OrderModifyObject ModifyConfig;

    /**
     * Get 标签数组, 空则表示不需要绑定标签 
     * @return Tags 标签数组, 空则表示不需要绑定标签
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签数组, 空则表示不需要绑定标签
     * @param Tags 标签数组, 空则表示不需要绑定标签
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
默认为0 
     * @return LicenseType 授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
默认为0
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set 授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
默认为0
     * @param LicenseType 授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月
默认为0
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get 授权数量 , 需要购买的数量.
默认为1 
     * @return LicenseNum 授权数量 , 需要购买的数量.
默认为1
     */
    public Long getLicenseNum() {
        return this.LicenseNum;
    }

    /**
     * Set 授权数量 , 需要购买的数量.
默认为1
     * @param LicenseNum 授权数量 , 需要购买的数量.
默认为1
     */
    public void setLicenseNum(Long LicenseNum) {
        this.LicenseNum = LicenseNum;
    }

    /**
     * Get 购买订单地域,这里仅支持 1 广州,9 新加坡. 推荐选择广州. 新加坡地域为白名单用户购买.
默认为1 
     * @return RegionId 购买订单地域,这里仅支持 1 广州,9 新加坡. 推荐选择广州. 新加坡地域为白名单用户购买.
默认为1
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 购买订单地域,这里仅支持 1 广州,9 新加坡. 推荐选择广州. 新加坡地域为白名单用户购买.
默认为1
     * @param RegionId 购买订单地域,这里仅支持 1 广州,9 新加坡. 推荐选择广州. 新加坡地域为白名单用户购买.
默认为1
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 项目ID .
默认为0 
     * @return ProjectId 项目ID .
默认为0
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID .
默认为0
     * @param ProjectId 项目ID .
默认为0
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 购买时间长度,默认1 , 可选值为1,2,3,4,5,6,7,8,9,10,11,12,24,36
该参数仅包年包月生效 
     * @return TimeSpan 购买时间长度,默认1 , 可选值为1,2,3,4,5,6,7,8,9,10,11,12,24,36
该参数仅包年包月生效
     */
    public Long getTimeSpan() {
        return this.TimeSpan;
    }

    /**
     * Set 购买时间长度,默认1 , 可选值为1,2,3,4,5,6,7,8,9,10,11,12,24,36
该参数仅包年包月生效
     * @param TimeSpan 购买时间长度,默认1 , 可选值为1,2,3,4,5,6,7,8,9,10,11,12,24,36
该参数仅包年包月生效
     */
    public void setTimeSpan(Long TimeSpan) {
        this.TimeSpan = TimeSpan;
    }

    /**
     * Get 是否自动续费, 默认不自动续费.
该参数仅包年包月生效 
     * @return AutoRenewFlag 是否自动续费, 默认不自动续费.
该参数仅包年包月生效
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费, 默认不自动续费.
该参数仅包年包月生效
     * @param AutoRenewFlag 是否自动续费, 默认不自动续费.
该参数仅包年包月生效
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 该字段作废 
     * @return AutoProtectOpenConfig 该字段作废
     */
    public String getAutoProtectOpenConfig() {
        return this.AutoProtectOpenConfig;
    }

    /**
     * Set 该字段作废
     * @param AutoProtectOpenConfig 该字段作废
     */
    public void setAutoProtectOpenConfig(String AutoProtectOpenConfig) {
        this.AutoProtectOpenConfig = AutoProtectOpenConfig;
    }

    /**
     * Get 变配参数 
     * @return ModifyConfig 变配参数
     */
    public OrderModifyObject getModifyConfig() {
        return this.ModifyConfig;
    }

    /**
     * Set 变配参数
     * @param ModifyConfig 变配参数
     */
    public void setModifyConfig(OrderModifyObject ModifyConfig) {
        this.ModifyConfig = ModifyConfig;
    }

    public CreateLicenseOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLicenseOrderRequest(CreateLicenseOrderRequest source) {
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseNum != null) {
            this.LicenseNum = new Long(source.LicenseNum);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TimeSpan != null) {
            this.TimeSpan = new Long(source.TimeSpan);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.AutoProtectOpenConfig != null) {
            this.AutoProtectOpenConfig = new String(source.AutoProtectOpenConfig);
        }
        if (source.ModifyConfig != null) {
            this.ModifyConfig = new OrderModifyObject(source.ModifyConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseNum", this.LicenseNum);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TimeSpan", this.TimeSpan);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "AutoProtectOpenConfig", this.AutoProtectOpenConfig);
        this.setParamObj(map, prefix + "ModifyConfig.", this.ModifyConfig);

    }
}

