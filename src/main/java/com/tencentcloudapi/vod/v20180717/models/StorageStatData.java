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

public class StorageStatData extends AbstractModel{

    /**
    * 点播存储的计费区域，可能值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 当前总存储量，单位是字节。
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * 当前低频存储量，单位是字节。
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * 当前标准存储量，单位是字节。
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
     * Get 点播存储的计费区域，可能值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li> 
     * @return Area 点播存储的计费区域，可能值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 点播存储的计费区域，可能值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     * @param Area 点播存储的计费区域，可能值：
<li>Chinese Mainland：中国境内（不包含港澳台）。</li>
<li>Outside Chinese Mainland：中国境外。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get 当前总存储量，单位是字节。 
     * @return TotalStorage 当前总存储量，单位是字节。
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set 当前总存储量，单位是字节。
     * @param TotalStorage 当前总存储量，单位是字节。
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get 当前低频存储量，单位是字节。 
     * @return InfrequentStorage 当前低频存储量，单位是字节。
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set 当前低频存储量，单位是字节。
     * @param InfrequentStorage 当前低频存储量，单位是字节。
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get 当前标准存储量，单位是字节。 
     * @return StandardStorage 当前标准存储量，单位是字节。
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set 当前标准存储量，单位是字节。
     * @param StandardStorage 当前标准存储量，单位是字节。
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    public StorageStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageStatData(StorageStatData source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TotalStorage != null) {
            this.TotalStorage = new Long(source.TotalStorage);
        }
        if (source.InfrequentStorage != null) {
            this.InfrequentStorage = new Long(source.InfrequentStorage);
        }
        if (source.StandardStorage != null) {
            this.StandardStorage = new Long(source.StandardStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);

    }
}

