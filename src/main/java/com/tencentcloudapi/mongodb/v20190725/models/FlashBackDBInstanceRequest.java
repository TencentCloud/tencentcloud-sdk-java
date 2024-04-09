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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlashBackDBInstanceRequest extends AbstractModel {

    /**
    * 开启按 Key 回档的实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 源数据想恢复到的时间。
    */
    @SerializedName("TargetFlashbackTime")
    @Expose
    private String TargetFlashbackTime;

    /**
    * 源数据所在的库表信息。
    */
    @SerializedName("TargetDatabases")
    @Expose
    private FlashbackDatabase [] TargetDatabases;

    /**
    * 数据最终写入的实例 ID。
    */
    @SerializedName("TargetInstanceId")
    @Expose
    private String TargetInstanceId;

    /**
     * Get 开启按 Key 回档的实例 ID。 
     * @return InstanceId 开启按 Key 回档的实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 开启按 Key 回档的实例 ID。
     * @param InstanceId 开启按 Key 回档的实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 源数据想恢复到的时间。 
     * @return TargetFlashbackTime 源数据想恢复到的时间。
     */
    public String getTargetFlashbackTime() {
        return this.TargetFlashbackTime;
    }

    /**
     * Set 源数据想恢复到的时间。
     * @param TargetFlashbackTime 源数据想恢复到的时间。
     */
    public void setTargetFlashbackTime(String TargetFlashbackTime) {
        this.TargetFlashbackTime = TargetFlashbackTime;
    }

    /**
     * Get 源数据所在的库表信息。 
     * @return TargetDatabases 源数据所在的库表信息。
     */
    public FlashbackDatabase [] getTargetDatabases() {
        return this.TargetDatabases;
    }

    /**
     * Set 源数据所在的库表信息。
     * @param TargetDatabases 源数据所在的库表信息。
     */
    public void setTargetDatabases(FlashbackDatabase [] TargetDatabases) {
        this.TargetDatabases = TargetDatabases;
    }

    /**
     * Get 数据最终写入的实例 ID。 
     * @return TargetInstanceId 数据最终写入的实例 ID。
     */
    public String getTargetInstanceId() {
        return this.TargetInstanceId;
    }

    /**
     * Set 数据最终写入的实例 ID。
     * @param TargetInstanceId 数据最终写入的实例 ID。
     */
    public void setTargetInstanceId(String TargetInstanceId) {
        this.TargetInstanceId = TargetInstanceId;
    }

    public FlashBackDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlashBackDBInstanceRequest(FlashBackDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.TargetFlashbackTime != null) {
            this.TargetFlashbackTime = new String(source.TargetFlashbackTime);
        }
        if (source.TargetDatabases != null) {
            this.TargetDatabases = new FlashbackDatabase[source.TargetDatabases.length];
            for (int i = 0; i < source.TargetDatabases.length; i++) {
                this.TargetDatabases[i] = new FlashbackDatabase(source.TargetDatabases[i]);
            }
        }
        if (source.TargetInstanceId != null) {
            this.TargetInstanceId = new String(source.TargetInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TargetFlashbackTime", this.TargetFlashbackTime);
        this.setParamArrayObj(map, prefix + "TargetDatabases.", this.TargetDatabases);
        this.setParamSimple(map, prefix + "TargetInstanceId", this.TargetInstanceId);

    }
}

