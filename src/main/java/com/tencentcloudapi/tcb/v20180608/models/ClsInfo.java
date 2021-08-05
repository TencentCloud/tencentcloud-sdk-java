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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClsInfo extends AbstractModel{

    /**
    * cls所属地域
    */
    @SerializedName("ClsRegion")
    @Expose
    private String ClsRegion;

    /**
    * cls日志集ID
    */
    @SerializedName("ClsLogsetId")
    @Expose
    private String ClsLogsetId;

    /**
    * cls日志主题ID
    */
    @SerializedName("ClsTopicId")
    @Expose
    private String ClsTopicId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get cls所属地域 
     * @return ClsRegion cls所属地域
     */
    public String getClsRegion() {
        return this.ClsRegion;
    }

    /**
     * Set cls所属地域
     * @param ClsRegion cls所属地域
     */
    public void setClsRegion(String ClsRegion) {
        this.ClsRegion = ClsRegion;
    }

    /**
     * Get cls日志集ID 
     * @return ClsLogsetId cls日志集ID
     */
    public String getClsLogsetId() {
        return this.ClsLogsetId;
    }

    /**
     * Set cls日志集ID
     * @param ClsLogsetId cls日志集ID
     */
    public void setClsLogsetId(String ClsLogsetId) {
        this.ClsLogsetId = ClsLogsetId;
    }

    /**
     * Get cls日志主题ID 
     * @return ClsTopicId cls日志主题ID
     */
    public String getClsTopicId() {
        return this.ClsTopicId;
    }

    /**
     * Set cls日志主题ID
     * @param ClsTopicId cls日志主题ID
     */
    public void setClsTopicId(String ClsTopicId) {
        this.ClsTopicId = ClsTopicId;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public ClsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClsInfo(ClsInfo source) {
        if (source.ClsRegion != null) {
            this.ClsRegion = new String(source.ClsRegion);
        }
        if (source.ClsLogsetId != null) {
            this.ClsLogsetId = new String(source.ClsLogsetId);
        }
        if (source.ClsTopicId != null) {
            this.ClsTopicId = new String(source.ClsTopicId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsRegion", this.ClsRegion);
        this.setParamSimple(map, prefix + "ClsLogsetId", this.ClsLogsetId);
        this.setParamSimple(map, prefix + "ClsTopicId", this.ClsTopicId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

