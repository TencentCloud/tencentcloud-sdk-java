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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBotStatusRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 是否是bot4.0版本
    */
    @SerializedName("IsVersionFour")
    @Expose
    private Boolean IsVersionFour;

    /**
    * 传入Bot版本号，场景化版本为"4.1.0"
    */
    @SerializedName("BotVersion")
    @Expose
    private String BotVersion;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 类别 
     * @return Category 类别
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 类别
     * @param Category 类别
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例id 
     * @return InstanceID 实例id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例id
     * @param InstanceID 实例id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 是否是bot4.0版本 
     * @return IsVersionFour 是否是bot4.0版本
     */
    public Boolean getIsVersionFour() {
        return this.IsVersionFour;
    }

    /**
     * Set 是否是bot4.0版本
     * @param IsVersionFour 是否是bot4.0版本
     */
    public void setIsVersionFour(Boolean IsVersionFour) {
        this.IsVersionFour = IsVersionFour;
    }

    /**
     * Get 传入Bot版本号，场景化版本为"4.1.0" 
     * @return BotVersion 传入Bot版本号，场景化版本为"4.1.0"
     */
    public String getBotVersion() {
        return this.BotVersion;
    }

    /**
     * Set 传入Bot版本号，场景化版本为"4.1.0"
     * @param BotVersion 传入Bot版本号，场景化版本为"4.1.0"
     */
    public void setBotVersion(String BotVersion) {
        this.BotVersion = BotVersion;
    }

    public ModifyBotStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBotStatusRequest(ModifyBotStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.IsVersionFour != null) {
            this.IsVersionFour = new Boolean(source.IsVersionFour);
        }
        if (source.BotVersion != null) {
            this.BotVersion = new String(source.BotVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "IsVersionFour", this.IsVersionFour);
        this.setParamSimple(map, prefix + "BotVersion", this.BotVersion);

    }
}

