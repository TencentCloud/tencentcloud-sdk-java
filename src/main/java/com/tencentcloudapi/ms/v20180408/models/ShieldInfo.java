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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShieldInfo  extends AbstractModel{

    /**
    * 加固结果的返回码
    */
    @SerializedName("ShieldCode")
    @Expose
    private Integer ShieldCode;

    /**
    * 加固后app的大小
    */
    @SerializedName("ShieldSize")
    @Expose
    private Integer ShieldSize;

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
    private Integer TaskTime;

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
     * 获取加固结果的返回码
     * @return ShieldCode 加固结果的返回码
     */
    public Integer getShieldCode() {
        return this.ShieldCode;
    }

    /**
     * 设置加固结果的返回码
     * @param ShieldCode 加固结果的返回码
     */
    public void setShieldCode(Integer ShieldCode) {
        this.ShieldCode = ShieldCode;
    }

    /**
     * 获取加固后app的大小
     * @return ShieldSize 加固后app的大小
     */
    public Integer getShieldSize() {
        return this.ShieldSize;
    }

    /**
     * 设置加固后app的大小
     * @param ShieldSize 加固后app的大小
     */
    public void setShieldSize(Integer ShieldSize) {
        this.ShieldSize = ShieldSize;
    }

    /**
     * 获取加固后app的md5
     * @return ShieldMd5 加固后app的md5
     */
    public String getShieldMd5() {
        return this.ShieldMd5;
    }

    /**
     * 设置加固后app的md5
     * @param ShieldMd5 加固后app的md5
     */
    public void setShieldMd5(String ShieldMd5) {
        this.ShieldMd5 = ShieldMd5;
    }

    /**
     * 获取加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     * @return AppUrl 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * 设置加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     * @param AppUrl 加固后的APP下载地址，该地址有效期为20分钟，请及时下载
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * 获取加固的提交时间
     * @return TaskTime 加固的提交时间
     */
    public Integer getTaskTime() {
        return this.TaskTime;
    }

    /**
     * 设置加固的提交时间
     * @param TaskTime 加固的提交时间
     */
    public void setTaskTime(Integer TaskTime) {
        this.TaskTime = TaskTime;
    }

    /**
     * 获取任务唯一标识
     * @return ItemId 任务唯一标识
     */
    public String getItemId() {
        return this.ItemId;
    }

    /**
     * 设置任务唯一标识
     * @param ItemId 任务唯一标识
     */
    public void setItemId(String ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * 获取加固版本，basic基础版，professional专业版，enterprise企业版
     * @return ServiceEdition 加固版本，basic基础版，professional专业版，enterprise企业版
     */
    public String getServiceEdition() {
        return this.ServiceEdition;
    }

    /**
     * 设置加固版本，basic基础版，professional专业版，enterprise企业版
     * @param ServiceEdition 加固版本，basic基础版，professional专业版，enterprise企业版
     */
    public void setServiceEdition(String ServiceEdition) {
        this.ServiceEdition = ServiceEdition;
    }

    /**
     * 内部实现，用户禁止调用
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

