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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MultiDiskMC extends AbstractModel {

    /**
    * 该类型云盘个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 磁盘类型
1  :本地盘
2  :云硬盘
3  : 本地SSD
4  : 云SSD
5  : 高效云盘
6  : 增强型SSD云硬盘
11 : 吞吐型云硬盘
12 : 极速型SSD云硬盘
13 : 通用型SSD云硬盘
14 : 大数据型云硬盘
15 : 高IO型云硬盘
16 : 远端SSD盘
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 磁盘大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 云盘大小,单位b
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
     * Get 该类型云盘个数 
     * @return Count 该类型云盘个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 该类型云盘个数
     * @param Count 该类型云盘个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 磁盘类型
1  :本地盘
2  :云硬盘
3  : 本地SSD
4  : 云SSD
5  : 高效云盘
6  : 增强型SSD云硬盘
11 : 吞吐型云硬盘
12 : 极速型SSD云硬盘
13 : 通用型SSD云硬盘
14 : 大数据型云硬盘
15 : 高IO型云硬盘
16 : 远端SSD盘 
     * @return Type 磁盘类型
1  :本地盘
2  :云硬盘
3  : 本地SSD
4  : 云SSD
5  : 高效云盘
6  : 增强型SSD云硬盘
11 : 吞吐型云硬盘
12 : 极速型SSD云硬盘
13 : 通用型SSD云硬盘
14 : 大数据型云硬盘
15 : 高IO型云硬盘
16 : 远端SSD盘
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 磁盘类型
1  :本地盘
2  :云硬盘
3  : 本地SSD
4  : 云SSD
5  : 高效云盘
6  : 增强型SSD云硬盘
11 : 吞吐型云硬盘
12 : 极速型SSD云硬盘
13 : 通用型SSD云硬盘
14 : 大数据型云硬盘
15 : 高IO型云硬盘
16 : 远端SSD盘
     * @param Type 磁盘类型
1  :本地盘
2  :云硬盘
3  : 本地SSD
4  : 云SSD
5  : 高效云盘
6  : 增强型SSD云硬盘
11 : 吞吐型云硬盘
12 : 极速型SSD云硬盘
13 : 通用型SSD云硬盘
14 : 大数据型云硬盘
15 : 高IO型云硬盘
16 : 远端SSD盘
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 磁盘大小 
     * @return Size 磁盘大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * Set 磁盘大小
     * @param Size 磁盘大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * Get 云盘大小,单位b 
     * @return Volume 云盘大小,单位b
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 云盘大小,单位b
     * @param Volume 云盘大小,单位b
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    public MultiDiskMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MultiDiskMC(MultiDiskMC source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new String(source.Size);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Volume", this.Volume);

    }
}

