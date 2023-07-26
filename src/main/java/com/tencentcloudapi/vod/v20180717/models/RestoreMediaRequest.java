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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RestoreMediaRequest extends AbstractModel{

    /**
    * 媒体文件唯一标识列表，最大长度：100。
    */
    @SerializedName("FileIds")
    @Expose
    private String [] FileIds;

    /**
    * 解冻出的临时媒体文件的可访问持续时长，必须大于0，单位为“天”。
    */
    @SerializedName("RestoreDay")
    @Expose
    private Long RestoreDay;

    /**
    * 解冻模式。当媒体文件当前的存储类型为归档存储时，有以下取值：
<li>极速模式：Expedited，解冻任务在5分钟后完成。</li>
<li>标准模式：Standard，解冻任务在5小时后完成 。</li>
<li>批量模式：Bulk，，解冻任务在12小时后完成。</li>
当媒体文件的存储类型为深度归档存储时，有以下取值：
<li>标准模式：Standard，解冻任务在24小时后完成。</li>
<li>批量模式：Bulk，解冻任务在48小时后完成。</li>
    */
    @SerializedName("RestoreTier")
    @Expose
    private String RestoreTier;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * Get 媒体文件唯一标识列表，最大长度：100。 
     * @return FileIds 媒体文件唯一标识列表，最大长度：100。
     */
    public String [] getFileIds() {
        return this.FileIds;
    }

    /**
     * Set 媒体文件唯一标识列表，最大长度：100。
     * @param FileIds 媒体文件唯一标识列表，最大长度：100。
     */
    public void setFileIds(String [] FileIds) {
        this.FileIds = FileIds;
    }

    /**
     * Get 解冻出的临时媒体文件的可访问持续时长，必须大于0，单位为“天”。 
     * @return RestoreDay 解冻出的临时媒体文件的可访问持续时长，必须大于0，单位为“天”。
     */
    public Long getRestoreDay() {
        return this.RestoreDay;
    }

    /**
     * Set 解冻出的临时媒体文件的可访问持续时长，必须大于0，单位为“天”。
     * @param RestoreDay 解冻出的临时媒体文件的可访问持续时长，必须大于0，单位为“天”。
     */
    public void setRestoreDay(Long RestoreDay) {
        this.RestoreDay = RestoreDay;
    }

    /**
     * Get 解冻模式。当媒体文件当前的存储类型为归档存储时，有以下取值：
<li>极速模式：Expedited，解冻任务在5分钟后完成。</li>
<li>标准模式：Standard，解冻任务在5小时后完成 。</li>
<li>批量模式：Bulk，，解冻任务在12小时后完成。</li>
当媒体文件的存储类型为深度归档存储时，有以下取值：
<li>标准模式：Standard，解冻任务在24小时后完成。</li>
<li>批量模式：Bulk，解冻任务在48小时后完成。</li> 
     * @return RestoreTier 解冻模式。当媒体文件当前的存储类型为归档存储时，有以下取值：
<li>极速模式：Expedited，解冻任务在5分钟后完成。</li>
<li>标准模式：Standard，解冻任务在5小时后完成 。</li>
<li>批量模式：Bulk，，解冻任务在12小时后完成。</li>
当媒体文件的存储类型为深度归档存储时，有以下取值：
<li>标准模式：Standard，解冻任务在24小时后完成。</li>
<li>批量模式：Bulk，解冻任务在48小时后完成。</li>
     */
    public String getRestoreTier() {
        return this.RestoreTier;
    }

    /**
     * Set 解冻模式。当媒体文件当前的存储类型为归档存储时，有以下取值：
<li>极速模式：Expedited，解冻任务在5分钟后完成。</li>
<li>标准模式：Standard，解冻任务在5小时后完成 。</li>
<li>批量模式：Bulk，，解冻任务在12小时后完成。</li>
当媒体文件的存储类型为深度归档存储时，有以下取值：
<li>标准模式：Standard，解冻任务在24小时后完成。</li>
<li>批量模式：Bulk，解冻任务在48小时后完成。</li>
     * @param RestoreTier 解冻模式。当媒体文件当前的存储类型为归档存储时，有以下取值：
<li>极速模式：Expedited，解冻任务在5分钟后完成。</li>
<li>标准模式：Standard，解冻任务在5小时后完成 。</li>
<li>批量模式：Bulk，，解冻任务在12小时后完成。</li>
当媒体文件的存储类型为深度归档存储时，有以下取值：
<li>标准模式：Standard，解冻任务在24小时后完成。</li>
<li>批量模式：Bulk，解冻任务在48小时后完成。</li>
     */
    public void setRestoreTier(String RestoreTier) {
        this.RestoreTier = RestoreTier;
    }

    /**
     * Get 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。 
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    public RestoreMediaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RestoreMediaRequest(RestoreMediaRequest source) {
        if (source.FileIds != null) {
            this.FileIds = new String[source.FileIds.length];
            for (int i = 0; i < source.FileIds.length; i++) {
                this.FileIds[i] = new String(source.FileIds[i]);
            }
        }
        if (source.RestoreDay != null) {
            this.RestoreDay = new Long(source.RestoreDay);
        }
        if (source.RestoreTier != null) {
            this.RestoreTier = new String(source.RestoreTier);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FileIds.", this.FileIds);
        this.setParamSimple(map, prefix + "RestoreDay", this.RestoreDay);
        this.setParamSimple(map, prefix + "RestoreTier", this.RestoreTier);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

