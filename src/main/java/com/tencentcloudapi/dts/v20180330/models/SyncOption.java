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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SyncOption extends AbstractModel{

    /**
    * 同步对象，1-整个实例，2-指定库表
    */
    @SerializedName("SyncObject")
    @Expose
    private Long SyncObject;

    /**
    * 同步开始设置，1-立即开始
    */
    @SerializedName("RunMode")
    @Expose
    private Long RunMode;

    /**
    * 同步模式， 3-全量且增量同步
    */
    @SerializedName("SyncType")
    @Expose
    private Long SyncType;

    /**
    * 数据一致性检测， 1-无需配置
    */
    @SerializedName("ConsistencyType")
    @Expose
    private Long ConsistencyType;

    /**
     * Get 同步对象，1-整个实例，2-指定库表 
     * @return SyncObject 同步对象，1-整个实例，2-指定库表
     */
    public Long getSyncObject() {
        return this.SyncObject;
    }

    /**
     * Set 同步对象，1-整个实例，2-指定库表
     * @param SyncObject 同步对象，1-整个实例，2-指定库表
     */
    public void setSyncObject(Long SyncObject) {
        this.SyncObject = SyncObject;
    }

    /**
     * Get 同步开始设置，1-立即开始 
     * @return RunMode 同步开始设置，1-立即开始
     */
    public Long getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 同步开始设置，1-立即开始
     * @param RunMode 同步开始设置，1-立即开始
     */
    public void setRunMode(Long RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 同步模式， 3-全量且增量同步 
     * @return SyncType 同步模式， 3-全量且增量同步
     */
    public Long getSyncType() {
        return this.SyncType;
    }

    /**
     * Set 同步模式， 3-全量且增量同步
     * @param SyncType 同步模式， 3-全量且增量同步
     */
    public void setSyncType(Long SyncType) {
        this.SyncType = SyncType;
    }

    /**
     * Get 数据一致性检测， 1-无需配置 
     * @return ConsistencyType 数据一致性检测， 1-无需配置
     */
    public Long getConsistencyType() {
        return this.ConsistencyType;
    }

    /**
     * Set 数据一致性检测， 1-无需配置
     * @param ConsistencyType 数据一致性检测， 1-无需配置
     */
    public void setConsistencyType(Long ConsistencyType) {
        this.ConsistencyType = ConsistencyType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncObject", this.SyncObject);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamSimple(map, prefix + "SyncType", this.SyncType);
        this.setParamSimple(map, prefix + "ConsistencyType", this.ConsistencyType);

    }
}

