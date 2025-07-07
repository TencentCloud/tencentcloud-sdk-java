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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldInfo extends AbstractModel {

    /**
    * 加固结果的返回码
    */
    @SerializedName("ShieldCode")
    @Expose
    private Long ShieldCode;

    /**
    * 加固后app的大小
    */
    @SerializedName("ShieldSize")
    @Expose
    private Long ShieldSize;

    /**
    * 加固后app的md5
    */
    @SerializedName("ShieldMd5")
    @Expose
    private String ShieldMd5;

    /**
    * 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * 加固的提交时间
    */
    @SerializedName("TaskTime")
    @Expose
    private Long TaskTime;

    /**
    * 任务唯一标识
    */
    @SerializedName("ItemId")
    @Expose
    private String ItemId;

    /**
    * 加固版本，basic基础版，professional专业版，enterprise企业版
    */
    @SerializedName("ServiceEdition")
    @Expose
    private String ServiceEdition;

    /**
     * Get 加固结果的返回码 
     * @return ShieldCode 加固结果的返回码
     */
    public Long getShieldCode() {
        return this.ShieldCode;
    }

    /**
     * Set 加固结果的返回码
     * @param ShieldCode 加固结果的返回码
     */
    public void setShieldCode(Long ShieldCode) {
        this.ShieldCode = ShieldCode;
    }

    /**
     * Get 加固后app的大小 
     * @return ShieldSize 加固后app的大小
     */
    public Long getShieldSize() {
        return this.ShieldSize;
    }

    /**
     * Set 加固后app的大小
     * @param ShieldSize 加固后app的大小
     */
    public void setShieldSize(Long ShieldSize) {
        this.ShieldSize = ShieldSize;
    }

    /**
     * Get 加固后app的md5 
     * @return ShieldMd5 加固后app的md5
     */
    public String getShieldMd5() {
        return this.ShieldMd5;
    }

    /**
     * Set 加固后app的md5
     * @param ShieldMd5 加固后app的md5
     */
    public void setShieldMd5(String ShieldMd5) {
        this.ShieldMd5 = ShieldMd5;
    }

    /**
     * Get 加固后的APP下载地址，该地址有效期为20分钟，请及时下载 
     * @return AppUrl 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * Set 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     * @param AppUrl 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * Get 加固的提交时间 
     * @return TaskTime 加固的提交时间
     */
    public Long getTaskTime() {
        return this.TaskTime;
    }

    /**
     * Set 加固的提交时间
     * @param TaskTime 加固的提交时间
     */
    public void setTaskTime(Long TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * Get 任务唯一标识 
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * Set 任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get 加固版本，basic基础版，professional专业版，enterprise企业版 
     * @return ServiceEdition 加固版本，basic基础版，professional专业版，enterprise企业版
     */
    public String getServiceEdition() {
        return this.ServiceEdition;
    }

    /**
     * Set 加固版本，basic基础版，professional专业版，enterprise企业版
     * @param ServiceEdition 加固版本，basic基础版，professional专业版，enterprise企业版
     */
    public void setServiceEdition(String ServiceEdition) {
        this.ServiceEdition = ServiceEdition;
    }

    public ShieldInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShieldInfo(ShieldInfo source) {
        if (source.ShieldCode != null) {
            this.ShieldCode = new Long(source.ShieldCode);
        }
        if (source.ShieldSize != null) {
            this.ShieldSize = new Long(source.ShieldSize);
        }
        if (source.ShieldMd5 != null) {
            this.ShieldMd5 = new String(source.ShieldMd5);
        }
        if (source.AppUrl != null) {
            this.AppUrl = new String(source.AppUrl);
        }
        if (source.TaskTime != null) {
            this.TaskTime = new Long(source.TaskTime);
        }
        if (source.ItemId != null) {
            this.ItemId = new String(source.ItemId);
        }
        if (source.ServiceEdition != null) {
            this.ServiceEdition = new String(source.ServiceEdition);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ShieldCode", this.ShieldCode);
        this.setParamSimple(map, prefix + "ShieldSize", this.ShieldSize);
        this.setParamSimple(map, prefix + "ShieldMd5", this.ShieldMd5);
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "TaskTime", this.TaskTime);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ServiceEdition", this.ServiceEdition);

    }
}

