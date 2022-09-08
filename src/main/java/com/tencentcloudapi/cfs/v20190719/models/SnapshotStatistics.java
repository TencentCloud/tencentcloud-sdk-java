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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotStatistics extends AbstractModel{

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 快照总个数
    */
    @SerializedName("SnapshotNumber")
    @Expose
    private Long SnapshotNumber;

    /**
    * 快照总容量
    */
    @SerializedName("SnapshotSize")
    @Expose
    private Long SnapshotSize;

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 快照总个数 
     * @return SnapshotNumber 快照总个数
     */
    public Long getSnapshotNumber() {
        return this.SnapshotNumber;
    }

    /**
     * Set 快照总个数
     * @param SnapshotNumber 快照总个数
     */
    public void setSnapshotNumber(Long SnapshotNumber) {
        this.SnapshotNumber = SnapshotNumber;
    }

    /**
     * Get 快照总容量 
     * @return SnapshotSize 快照总容量
     */
    public Long getSnapshotSize() {
        return this.SnapshotSize;
    }

    /**
     * Set 快照总容量
     * @param SnapshotSize 快照总容量
     */
    public void setSnapshotSize(Long SnapshotSize) {
        this.SnapshotSize = SnapshotSize;
    }

    public SnapshotStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotStatistics(SnapshotStatistics source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SnapshotNumber != null) {
            this.SnapshotNumber = new Long(source.SnapshotNumber);
        }
        if (source.SnapshotSize != null) {
            this.SnapshotSize = new Long(source.SnapshotSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SnapshotNumber", this.SnapshotNumber);
        this.setParamSimple(map, prefix + "SnapshotSize", this.SnapshotSize);

    }
}

