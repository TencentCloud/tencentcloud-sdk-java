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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJvmMonitorRequest extends AbstractModel{

    /**
    * 查询的实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例所属应用Id
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 时间粒度,单位:秒
    */
    @SerializedName("TimeGranularity")
    @Expose
    private Long TimeGranularity;

    /**
    * 查询数据起始时间格式(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 查询数据结束时间格式(yyyy-MM-dd HH:mm:ss)
    */
    @SerializedName("To")
    @Expose
    private String To;

    /**
    * 查询的监控图列表,以返回值属性名作为入参
    */
    @SerializedName("RequiredPictures")
    @Expose
    private String [] RequiredPictures;

    /**
    * 扩展字段
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
     * Get 查询的实例Id 
     * @return InstanceId 查询的实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 查询的实例Id
     * @param InstanceId 查询的实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例所属应用Id 
     * @return ApplicationId 实例所属应用Id
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 实例所属应用Id
     * @param ApplicationId 实例所属应用Id
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 时间粒度,单位:秒 
     * @return TimeGranularity 时间粒度,单位:秒
     */
    public Long getTimeGranularity() {
        return this.TimeGranularity;
    }

    /**
     * Set 时间粒度,单位:秒
     * @param TimeGranularity 时间粒度,单位:秒
     */
    public void setTimeGranularity(Long TimeGranularity) {
        this.TimeGranularity = TimeGranularity;
    }

    /**
     * Get 查询数据起始时间格式(yyyy-MM-dd HH:mm:ss) 
     * @return From 查询数据起始时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 查询数据起始时间格式(yyyy-MM-dd HH:mm:ss)
     * @param From 查询数据起始时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 查询数据结束时间格式(yyyy-MM-dd HH:mm:ss) 
     * @return To 查询数据结束时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public String getTo() {
        return this.To;
    }

    /**
     * Set 查询数据结束时间格式(yyyy-MM-dd HH:mm:ss)
     * @param To 查询数据结束时间格式(yyyy-MM-dd HH:mm:ss)
     */
    public void setTo(String To) {
        this.To = To;
    }

    /**
     * Get 查询的监控图列表,以返回值属性名作为入参 
     * @return RequiredPictures 查询的监控图列表,以返回值属性名作为入参
     */
    public String [] getRequiredPictures() {
        return this.RequiredPictures;
    }

    /**
     * Set 查询的监控图列表,以返回值属性名作为入参
     * @param RequiredPictures 查询的监控图列表,以返回值属性名作为入参
     */
    public void setRequiredPictures(String [] RequiredPictures) {
        this.RequiredPictures = RequiredPictures;
    }

    /**
     * Get 扩展字段 
     * @return Tag 扩展字段
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set 扩展字段
     * @param Tag 扩展字段
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    public DescribeJvmMonitorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJvmMonitorRequest(DescribeJvmMonitorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.TimeGranularity != null) {
            this.TimeGranularity = new Long(source.TimeGranularity);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.To != null) {
            this.To = new String(source.To);
        }
        if (source.RequiredPictures != null) {
            this.RequiredPictures = new String[source.RequiredPictures.length];
            for (int i = 0; i < source.RequiredPictures.length; i++) {
                this.RequiredPictures[i] = new String(source.RequiredPictures[i]);
            }
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "TimeGranularity", this.TimeGranularity);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "To", this.To);
        this.setParamArraySimple(map, prefix + "RequiredPictures.", this.RequiredPictures);
        this.setParamSimple(map, prefix + "Tag", this.Tag);

    }
}

