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
package com.tencentcloudapi.ciam.v20220331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserStore extends AbstractModel{

    /**
    * 租户ID
    */
    @SerializedName("TenantId")
    @Expose
    private String TenantId;

    /**
    * 用户池logo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserStoreLogo")
    @Expose
    private String UserStoreLogo;

    /**
    * 用户池描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserStoreDesc")
    @Expose
    private String UserStoreDesc;

    /**
    * 用户池名称
    */
    @SerializedName("UserStoreName")
    @Expose
    private String UserStoreName;

    /**
    * 用户数量
    */
    @SerializedName("UserNum")
    @Expose
    private Long UserNum;

    /**
    * 用户池ID
    */
    @SerializedName("UserStoreId")
    @Expose
    private String UserStoreId;

    /**
    * 应用数量
    */
    @SerializedName("AppNum")
    @Expose
    private Long AppNum;

    /**
    * 上次切换的用户池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastStatus")
    @Expose
    private Boolean LastStatus;

    /**
    * 默认用户池
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultStatus")
    @Expose
    private Boolean DefaultStatus;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateDate")
    @Expose
    private Long CreateDate;

    /**
    * 上次切换时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastStatusTime")
    @Expose
    private Long LastStatusTime;

    /**
    * 用户目录域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserStoreProtocolHost")
    @Expose
    private String UserStoreProtocolHost;

    /**
     * Get 租户ID 
     * @return TenantId 租户ID
     */
    public String getTenantId() {
        return this.TenantId;
    }

    /**
     * Set 租户ID
     * @param TenantId 租户ID
     */
    public void setTenantId(String TenantId) {
        this.TenantId = TenantId;
    }

    /**
     * Get 用户池logo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserStoreLogo 用户池logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserStoreLogo() {
        return this.UserStoreLogo;
    }

    /**
     * Set 用户池logo
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserStoreLogo 用户池logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserStoreLogo(String UserStoreLogo) {
        this.UserStoreLogo = UserStoreLogo;
    }

    /**
     * Get 用户池描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserStoreDesc 用户池描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserStoreDesc() {
        return this.UserStoreDesc;
    }

    /**
     * Set 用户池描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserStoreDesc 用户池描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserStoreDesc(String UserStoreDesc) {
        this.UserStoreDesc = UserStoreDesc;
    }

    /**
     * Get 用户池名称 
     * @return UserStoreName 用户池名称
     */
    public String getUserStoreName() {
        return this.UserStoreName;
    }

    /**
     * Set 用户池名称
     * @param UserStoreName 用户池名称
     */
    public void setUserStoreName(String UserStoreName) {
        this.UserStoreName = UserStoreName;
    }

    /**
     * Get 用户数量 
     * @return UserNum 用户数量
     */
    public Long getUserNum() {
        return this.UserNum;
    }

    /**
     * Set 用户数量
     * @param UserNum 用户数量
     */
    public void setUserNum(Long UserNum) {
        this.UserNum = UserNum;
    }

    /**
     * Get 用户池ID 
     * @return UserStoreId 用户池ID
     */
    public String getUserStoreId() {
        return this.UserStoreId;
    }

    /**
     * Set 用户池ID
     * @param UserStoreId 用户池ID
     */
    public void setUserStoreId(String UserStoreId) {
        this.UserStoreId = UserStoreId;
    }

    /**
     * Get 应用数量 
     * @return AppNum 应用数量
     */
    public Long getAppNum() {
        return this.AppNum;
    }

    /**
     * Set 应用数量
     * @param AppNum 应用数量
     */
    public void setAppNum(Long AppNum) {
        this.AppNum = AppNum;
    }

    /**
     * Get 上次切换的用户池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastStatus 上次切换的用户池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getLastStatus() {
        return this.LastStatus;
    }

    /**
     * Set 上次切换的用户池
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastStatus 上次切换的用户池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastStatus(Boolean LastStatus) {
        this.LastStatus = LastStatus;
    }

    /**
     * Get 默认用户池
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultStatus 默认用户池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getDefaultStatus() {
        return this.DefaultStatus;
    }

    /**
     * Set 默认用户池
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultStatus 默认用户池
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultStatus(Boolean DefaultStatus) {
        this.DefaultStatus = DefaultStatus;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateDate 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateDate(Long CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get 上次切换时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastStatusTime 上次切换时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLastStatusTime() {
        return this.LastStatusTime;
    }

    /**
     * Set 上次切换时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastStatusTime 上次切换时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastStatusTime(Long LastStatusTime) {
        this.LastStatusTime = LastStatusTime;
    }

    /**
     * Get 用户目录域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserStoreProtocolHost 用户目录域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserStoreProtocolHost() {
        return this.UserStoreProtocolHost;
    }

    /**
     * Set 用户目录域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserStoreProtocolHost 用户目录域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserStoreProtocolHost(String UserStoreProtocolHost) {
        this.UserStoreProtocolHost = UserStoreProtocolHost;
    }

    public UserStore() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UserStore(UserStore source) {
        if (source.TenantId != null) {
            this.TenantId = new String(source.TenantId);
        }
        if (source.UserStoreLogo != null) {
            this.UserStoreLogo = new String(source.UserStoreLogo);
        }
        if (source.UserStoreDesc != null) {
            this.UserStoreDesc = new String(source.UserStoreDesc);
        }
        if (source.UserStoreName != null) {
            this.UserStoreName = new String(source.UserStoreName);
        }
        if (source.UserNum != null) {
            this.UserNum = new Long(source.UserNum);
        }
        if (source.UserStoreId != null) {
            this.UserStoreId = new String(source.UserStoreId);
        }
        if (source.AppNum != null) {
            this.AppNum = new Long(source.AppNum);
        }
        if (source.LastStatus != null) {
            this.LastStatus = new Boolean(source.LastStatus);
        }
        if (source.DefaultStatus != null) {
            this.DefaultStatus = new Boolean(source.DefaultStatus);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new Long(source.CreateDate);
        }
        if (source.LastStatusTime != null) {
            this.LastStatusTime = new Long(source.LastStatusTime);
        }
        if (source.UserStoreProtocolHost != null) {
            this.UserStoreProtocolHost = new String(source.UserStoreProtocolHost);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TenantId", this.TenantId);
        this.setParamSimple(map, prefix + "UserStoreLogo", this.UserStoreLogo);
        this.setParamSimple(map, prefix + "UserStoreDesc", this.UserStoreDesc);
        this.setParamSimple(map, prefix + "UserStoreName", this.UserStoreName);
        this.setParamSimple(map, prefix + "UserNum", this.UserNum);
        this.setParamSimple(map, prefix + "UserStoreId", this.UserStoreId);
        this.setParamSimple(map, prefix + "AppNum", this.AppNum);
        this.setParamSimple(map, prefix + "LastStatus", this.LastStatus);
        this.setParamSimple(map, prefix + "DefaultStatus", this.DefaultStatus);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "LastStatusTime", this.LastStatusTime);
        this.setParamSimple(map, prefix + "UserStoreProtocolHost", this.UserStoreProtocolHost);

    }
}

