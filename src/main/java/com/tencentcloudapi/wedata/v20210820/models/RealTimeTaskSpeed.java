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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RealTimeTaskSpeed extends AbstractModel {

    /**
    * 同步速度条/s列表
    */
    @SerializedName("RecordsSpeedList")
    @Expose
    private RecordsSpeed [] RecordsSpeedList;

    /**
    * 同步速度字节/s列表
    */
    @SerializedName("BytesSpeedList")
    @Expose
    private BytesSpeed [] BytesSpeedList;

    /**
    * 日志条数速度
    */
    @SerializedName("RecordsLogSpeed")
    @Expose
    private RecordsSpeed [] RecordsLogSpeed;

    /**
    * 日志大小速度
    */
    @SerializedName("BytesLogSpeed")
    @Expose
    private BytesSpeed [] BytesLogSpeed;

    /**
     * Get 同步速度条/s列表 
     * @return RecordsSpeedList 同步速度条/s列表
     */
    public RecordsSpeed [] getRecordsSpeedList() {
        return this.RecordsSpeedList;
    }

    /**
     * Set 同步速度条/s列表
     * @param RecordsSpeedList 同步速度条/s列表
     */
    public void setRecordsSpeedList(RecordsSpeed [] RecordsSpeedList) {
        this.RecordsSpeedList = RecordsSpeedList;
    }

    /**
     * Get 同步速度字节/s列表 
     * @return BytesSpeedList 同步速度字节/s列表
     */
    public BytesSpeed [] getBytesSpeedList() {
        return this.BytesSpeedList;
    }

    /**
     * Set 同步速度字节/s列表
     * @param BytesSpeedList 同步速度字节/s列表
     */
    public void setBytesSpeedList(BytesSpeed [] BytesSpeedList) {
        this.BytesSpeedList = BytesSpeedList;
    }

    /**
     * Get 日志条数速度 
     * @return RecordsLogSpeed 日志条数速度
     */
    public RecordsSpeed [] getRecordsLogSpeed() {
        return this.RecordsLogSpeed;
    }

    /**
     * Set 日志条数速度
     * @param RecordsLogSpeed 日志条数速度
     */
    public void setRecordsLogSpeed(RecordsSpeed [] RecordsLogSpeed) {
        this.RecordsLogSpeed = RecordsLogSpeed;
    }

    /**
     * Get 日志大小速度 
     * @return BytesLogSpeed 日志大小速度
     */
    public BytesSpeed [] getBytesLogSpeed() {
        return this.BytesLogSpeed;
    }

    /**
     * Set 日志大小速度
     * @param BytesLogSpeed 日志大小速度
     */
    public void setBytesLogSpeed(BytesSpeed [] BytesLogSpeed) {
        this.BytesLogSpeed = BytesLogSpeed;
    }

    public RealTimeTaskSpeed() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RealTimeTaskSpeed(RealTimeTaskSpeed source) {
        if (source.RecordsSpeedList != null) {
            this.RecordsSpeedList = new RecordsSpeed[source.RecordsSpeedList.length];
            for (int i = 0; i < source.RecordsSpeedList.length; i++) {
                this.RecordsSpeedList[i] = new RecordsSpeed(source.RecordsSpeedList[i]);
            }
        }
        if (source.BytesSpeedList != null) {
            this.BytesSpeedList = new BytesSpeed[source.BytesSpeedList.length];
            for (int i = 0; i < source.BytesSpeedList.length; i++) {
                this.BytesSpeedList[i] = new BytesSpeed(source.BytesSpeedList[i]);
            }
        }
        if (source.RecordsLogSpeed != null) {
            this.RecordsLogSpeed = new RecordsSpeed[source.RecordsLogSpeed.length];
            for (int i = 0; i < source.RecordsLogSpeed.length; i++) {
                this.RecordsLogSpeed[i] = new RecordsSpeed(source.RecordsLogSpeed[i]);
            }
        }
        if (source.BytesLogSpeed != null) {
            this.BytesLogSpeed = new BytesSpeed[source.BytesLogSpeed.length];
            for (int i = 0; i < source.BytesLogSpeed.length; i++) {
                this.BytesLogSpeed[i] = new BytesSpeed(source.BytesLogSpeed[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordsSpeedList.", this.RecordsSpeedList);
        this.setParamArrayObj(map, prefix + "BytesSpeedList.", this.BytesSpeedList);
        this.setParamArrayObj(map, prefix + "RecordsLogSpeed.", this.RecordsLogSpeed);
        this.setParamArrayObj(map, prefix + "BytesLogSpeed.", this.BytesLogSpeed);

    }
}

