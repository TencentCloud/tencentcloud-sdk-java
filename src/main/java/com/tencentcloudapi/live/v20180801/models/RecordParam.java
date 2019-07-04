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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecordParam  extends AbstractModel{

    /**
    * 录制间隔。
单位秒，默认值1800。
取值范围:300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
    */
    @SerializedName("RecordInterval")
    @Expose
    private Integer RecordInterval;

    /**
    * 录制存储时长。
单位秒，取值范围： 0-93312000。
0表示永久存储。
    */
    @SerializedName("StorageTime")
    @Expose
    private Integer StorageTime;

    /**
    * 是否开启当前格式录制，0 否 1是。默认值0。
    */
    @SerializedName("Enable")
    @Expose
    private Integer Enable;

    /**
     * 获取录制间隔。
单位秒，默认值1800。
取值范围:300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     * @return RecordInterval 录制间隔。
单位秒，默认值1800。
取值范围:300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public Integer getRecordInterval() {
        return this.RecordInterval;
    }

    /**
     * 设置录制间隔。
单位秒，默认值1800。
取值范围:300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     * @param RecordInterval 录制间隔。
单位秒，默认值1800。
取值范围:300-7200。
此参数对 HLS 无效，当录制 HLS 时从推流到断流生成一个文件。
     */
    public void setRecordInterval(Integer RecordInterval) {
        this.RecordInterval = RecordInterval;
    }

    /**
     * 获取录制存储时长。
单位秒，取值范围： 0-93312000。
0表示永久存储。
     * @return StorageTime 录制存储时长。
单位秒，取值范围： 0-93312000。
0表示永久存储。
     */
    public Integer getStorageTime() {
        return this.StorageTime;
    }

    /**
     * 设置录制存储时长。
单位秒，取值范围： 0-93312000。
0表示永久存储。
     * @param StorageTime 录制存储时长。
单位秒，取值范围： 0-93312000。
0表示永久存储。
     */
    public void setStorageTime(Integer StorageTime) {
        this.StorageTime = StorageTime;
    }

    /**
     * 获取是否开启当前格式录制，0 否 1是。默认值0。
     * @return Enable 是否开启当前格式录制，0 否 1是。默认值0。
     */
    public Integer getEnable() {
        return this.Enable;
    }

    /**
     * 设置是否开启当前格式录制，0 否 1是。默认值0。
     * @param Enable 是否开启当前格式录制，0 否 1是。默认值0。
     */
    public void setEnable(Integer Enable) {
        this.Enable = Enable;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordInterval", this.RecordInterval);
        this.setParamSimple(map, prefix + "StorageTime", this.StorageTime);
        this.setParamSimple(map, prefix + "Enable", this.Enable);

    }
}

