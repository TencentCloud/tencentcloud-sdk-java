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
package com.tencentcloudapi.zj.v20190121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MmsInstanceInfo extends AbstractModel{

    /**
    * 彩信实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private Long InstanceId;

    /**
    * 彩信实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 状态是否通知
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 实例审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusInfo")
    @Expose
    private MmsInstanceStateInfo [] StatusInfo;

    /**
    * 业务码
    */
    @SerializedName("AppSubId")
    @Expose
    private String AppSubId;

    /**
    * 彩信标题
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 签名
    */
    @SerializedName("Sign")
    @Expose
    private String Sign;

    /**
    * 彩信内容
    */
    @SerializedName("Contents")
    @Expose
    private String Contents;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 样例配置的链接地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Urls")
    @Expose
    private String [] Urls;

    /**
    * 机型列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PhoneType")
    @Expose
    private Long [] PhoneType;

    /**
    * 普通参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CommonParams")
    @Expose
    private Long [] CommonParams;

    /**
    * 链接参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UrlParams")
    @Expose
    private Long [] UrlParams;

    /**
     * Get 彩信实例id 
     * @return InstanceId 彩信实例id
     */
    public Long getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 彩信实例id
     * @param InstanceId 彩信实例id
     */
    public void setInstanceId(Long InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 彩信实例名称 
     * @return InstanceName 彩信实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 彩信实例名称
     * @param InstanceName 彩信实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 状态是否通知 
     * @return Status 状态是否通知
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态是否通知
     * @param Status 状态是否通知
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 实例审核状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusInfo 实例审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MmsInstanceStateInfo [] getStatusInfo() {
        return this.StatusInfo;
    }

    /**
     * Set 实例审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusInfo 实例审核状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusInfo(MmsInstanceStateInfo [] StatusInfo) {
        this.StatusInfo = StatusInfo;
    }

    /**
     * Get 业务码 
     * @return AppSubId 业务码
     */
    public String getAppSubId() {
        return this.AppSubId;
    }

    /**
     * Set 业务码
     * @param AppSubId 业务码
     */
    public void setAppSubId(String AppSubId) {
        this.AppSubId = AppSubId;
    }

    /**
     * Get 彩信标题 
     * @return Title 彩信标题
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 彩信标题
     * @param Title 彩信标题
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 签名 
     * @return Sign 签名
     */
    public String getSign() {
        return this.Sign;
    }

    /**
     * Set 签名
     * @param Sign 签名
     */
    public void setSign(String Sign) {
        this.Sign = Sign;
    }

    /**
     * Get 彩信内容 
     * @return Contents 彩信内容
     */
    public String getContents() {
        return this.Contents;
    }

    /**
     * Set 彩信内容
     * @param Contents 彩信内容
     */
    public void setContents(String Contents) {
        this.Contents = Contents;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 样例配置的链接地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Urls 样例配置的链接地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUrls() {
        return this.Urls;
    }

    /**
     * Set 样例配置的链接地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Urls 样例配置的链接地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrls(String [] Urls) {
        this.Urls = Urls;
    }

    /**
     * Get 机型列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PhoneType 机型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getPhoneType() {
        return this.PhoneType;
    }

    /**
     * Set 机型列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param PhoneType 机型列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPhoneType(Long [] PhoneType) {
        this.PhoneType = PhoneType;
    }

    /**
     * Get 普通参数序号数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CommonParams 普通参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getCommonParams() {
        return this.CommonParams;
    }

    /**
     * Set 普通参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param CommonParams 普通参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommonParams(Long [] CommonParams) {
        this.CommonParams = CommonParams;
    }

    /**
     * Get 链接参数序号数组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UrlParams 链接参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getUrlParams() {
        return this.UrlParams;
    }

    /**
     * Set 链接参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param UrlParams 链接参数序号数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUrlParams(Long [] UrlParams) {
        this.UrlParams = UrlParams;
    }

    public MmsInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MmsInstanceInfo(MmsInstanceInfo source) {
        if (source.InstanceId != null) {
            this.InstanceId = new Long(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusInfo != null) {
            this.StatusInfo = new MmsInstanceStateInfo[source.StatusInfo.length];
            for (int i = 0; i < source.StatusInfo.length; i++) {
                this.StatusInfo[i] = new MmsInstanceStateInfo(source.StatusInfo[i]);
            }
        }
        if (source.AppSubId != null) {
            this.AppSubId = new String(source.AppSubId);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Sign != null) {
            this.Sign = new String(source.Sign);
        }
        if (source.Contents != null) {
            this.Contents = new String(source.Contents);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.Urls != null) {
            this.Urls = new String[source.Urls.length];
            for (int i = 0; i < source.Urls.length; i++) {
                this.Urls[i] = new String(source.Urls[i]);
            }
        }
        if (source.PhoneType != null) {
            this.PhoneType = new Long[source.PhoneType.length];
            for (int i = 0; i < source.PhoneType.length; i++) {
                this.PhoneType[i] = new Long(source.PhoneType[i]);
            }
        }
        if (source.CommonParams != null) {
            this.CommonParams = new Long[source.CommonParams.length];
            for (int i = 0; i < source.CommonParams.length; i++) {
                this.CommonParams[i] = new Long(source.CommonParams[i]);
            }
        }
        if (source.UrlParams != null) {
            this.UrlParams = new Long[source.UrlParams.length];
            for (int i = 0; i < source.UrlParams.length; i++) {
                this.UrlParams[i] = new Long(source.UrlParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "StatusInfo.", this.StatusInfo);
        this.setParamSimple(map, prefix + "AppSubId", this.AppSubId);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Sign", this.Sign);
        this.setParamSimple(map, prefix + "Contents", this.Contents);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamArraySimple(map, prefix + "Urls.", this.Urls);
        this.setParamArraySimple(map, prefix + "PhoneType.", this.PhoneType);
        this.setParamArraySimple(map, prefix + "CommonParams.", this.CommonParams);
        this.setParamArraySimple(map, prefix + "UrlParams.", this.UrlParams);

    }
}

