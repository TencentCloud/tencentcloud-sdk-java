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
package com.tencentcloudapi.anicloud.v20220923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * 资源拥有者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UIN")
    @Expose
    private String UIN;

    /**
    * 云平台应用ID，一般来说与uin存在一一对应的关系
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 资源id，会展示到通知内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 区域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 资源状态，1正常，2隔离，3销毁(如果资源已经删除或销毁，不需要返回)，4冻结/封禁
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 资源隔离时间，未隔离传"0000-00-00 00:00:00"，资源由隔离变回正常传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolatedTimestamp")
    @Expose
    private String IsolatedTimestamp;

    /**
    * 资源创建时间，用于更新新购订单的资源开始时间，按时长退费时的资源结束时间取自订单的资源结束时间，
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 0后付费 1预付费 2预留实例
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 资源名称，账单中资源别名，生命周期通知中的资源名称，不返回则通知中展示为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 购买详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsDetail")
    @Expose
    private GoodsDetail GoodsDetail;

    /**
    * 预付费必填 ，自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * （仅预付费）资源到期时间，无到期概念传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 地域ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private Long Region;

    /**
    * sdk appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SdkAppId")
    @Expose
    private String SdkAppId;

    /**
    * app名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的package名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 资源链接
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * app的entry
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Entry")
    @Expose
    private String Entry;

    /**
    * 0：sdk 1：素材
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstType")
    @Expose
    private Long InstType;

    /**
    * license的秘钥
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
     * Get 资源拥有者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UIN 资源拥有者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUIN() {
        return this.UIN;
    }

    /**
     * Set 资源拥有者
注意：此字段可能返回 null，表示取不到有效值。
     * @param UIN 资源拥有者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUIN(String UIN) {
        this.UIN = UIN;
    }

    /**
     * Get 云平台应用ID，一般来说与uin存在一一对应的关系
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 云平台应用ID，一般来说与uin存在一一对应的关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 云平台应用ID，一般来说与uin存在一一对应的关系
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 云平台应用ID，一般来说与uin存在一一对应的关系
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 资源id，会展示到通知内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源id，会展示到通知内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源id，会展示到通知内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源id，会展示到通知内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 区域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ZoneId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ZoneId 区域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 资源状态，1正常，2隔离，3销毁(如果资源已经删除或销毁，不需要返回)，4冻结/封禁
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 资源状态，1正常，2隔离，3销毁(如果资源已经删除或销毁，不需要返回)，4冻结/封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 资源状态，1正常，2隔离，3销毁(如果资源已经删除或销毁，不需要返回)，4冻结/封禁
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 资源状态，1正常，2隔离，3销毁(如果资源已经删除或销毁，不需要返回)，4冻结/封禁
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 资源隔离时间，未隔离传"0000-00-00 00:00:00"，资源由隔离变回正常传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolatedTimestamp 资源隔离时间，未隔离传"0000-00-00 00:00:00"，资源由隔离变回正常传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolatedTimestamp() {
        return this.IsolatedTimestamp;
    }

    /**
     * Set 资源隔离时间，未隔离传"0000-00-00 00:00:00"，资源由隔离变回正常传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolatedTimestamp 资源隔离时间，未隔离传"0000-00-00 00:00:00"，资源由隔离变回正常传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolatedTimestamp(String IsolatedTimestamp) {
        this.IsolatedTimestamp = IsolatedTimestamp;
    }

    /**
     * Get 资源创建时间，用于更新新购订单的资源开始时间，按时长退费时的资源结束时间取自订单的资源结束时间，
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 资源创建时间，用于更新新购订单的资源开始时间，按时长退费时的资源结束时间取自订单的资源结束时间，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 资源创建时间，用于更新新购订单的资源开始时间，按时长退费时的资源结束时间取自订单的资源结束时间，
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 资源创建时间，用于更新新购订单的资源开始时间，按时长退费时的资源结束时间取自订单的资源结束时间，
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 0后付费 1预付费 2预留实例
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PayMode 0后付费 1预付费 2预留实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 0后付费 1预付费 2预留实例
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayMode 0后付费 1预付费 2预留实例
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 资源名称，账单中资源别名，生命周期通知中的资源名称，不返回则通知中展示为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Alias 资源名称，账单中资源别名，生命周期通知中的资源名称，不返回则通知中展示为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set 资源名称，账单中资源别名，生命周期通知中的资源名称，不返回则通知中展示为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param Alias 资源名称，账单中资源别名，生命周期通知中的资源名称，不返回则通知中展示为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get 购买详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GoodsDetail 购买详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public GoodsDetail getGoodsDetail() {
        return this.GoodsDetail;
    }

    /**
     * Set 购买详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsDetail 购买详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsDetail(GoodsDetail GoodsDetail) {
        this.GoodsDetail = GoodsDetail;
    }

    /**
     * Get 预付费必填 ，自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RenewFlag 预付费必填 ，自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 预付费必填 ，自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
注意：此字段可能返回 null，表示取不到有效值。
     * @param RenewFlag 预付费必填 ，自动续费标记，0表示默认状态(用户未设置，即初始状态即手动续费，用户开通了预付费不停服特权也会进行自动续费)， 1表示自动续费，2表示明确不自动续费(用户设置)，若业务无续费概念或无需自动续费，需要设置为0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get （仅预付费）资源到期时间，无到期概念传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime （仅预付费）资源到期时间，无到期概念传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set （仅预付费）资源到期时间，无到期概念传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime （仅预付费）资源到期时间，无到期概念传"0000-00-00 00:00:00"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 地域ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRegion() {
        return this.Region;
    }

    /**
     * Set 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(Long Region) {
        this.Region = Region;
    }

    /**
     * Get sdk appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SdkAppId sdk appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSdkAppId() {
        return this.SdkAppId;
    }

    /**
     * Set sdk appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param SdkAppId sdk appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSdkAppId(String SdkAppId) {
        this.SdkAppId = SdkAppId;
    }

    /**
     * Get app名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppName app名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppName app名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get app的package名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName app的package名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set app的package名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName app的package名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 资源链接
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URL 资源链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 资源链接
注意：此字段可能返回 null，表示取不到有效值。
     * @param URL 资源链接
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get app的entry
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Entry app的entry
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEntry() {
        return this.Entry;
    }

    /**
     * Set app的entry
注意：此字段可能返回 null，表示取不到有效值。
     * @param Entry app的entry
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEntry(String Entry) {
        this.Entry = Entry;
    }

    /**
     * Get 0：sdk 1：素材
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstType 0：sdk 1：素材
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstType() {
        return this.InstType;
    }

    /**
     * Set 0：sdk 1：素材
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstType 0：sdk 1：素材
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstType(Long InstType) {
        this.InstType = InstType;
    }

    /**
     * Get license的秘钥
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key license的秘钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set license的秘钥
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key license的秘钥
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.UIN != null) {
            this.UIN = new String(source.UIN);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new Long(source.ZoneId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsolatedTimestamp != null) {
            this.IsolatedTimestamp = new String(source.IsolatedTimestamp);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.GoodsDetail != null) {
            this.GoodsDetail = new GoodsDetail(source.GoodsDetail);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Region != null) {
            this.Region = new Long(source.Region);
        }
        if (source.SdkAppId != null) {
            this.SdkAppId = new String(source.SdkAppId);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Entry != null) {
            this.Entry = new String(source.Entry);
        }
        if (source.InstType != null) {
            this.InstType = new Long(source.InstType);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UIN", this.UIN);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsolatedTimestamp", this.IsolatedTimestamp);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamObj(map, prefix + "GoodsDetail.", this.GoodsDetail);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SdkAppId", this.SdkAppId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Entry", this.Entry);
        this.setParamSimple(map, prefix + "InstType", this.InstType);
        this.setParamSimple(map, prefix + "Key", this.Key);

    }
}

