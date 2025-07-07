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
package com.tencentcloudapi.iotvideo.v20211125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudStoragePackageInfo extends AbstractModel {

    /**
    * 套餐包id
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 套餐包名字
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 套餐包数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * 已使用数量
    */
    @SerializedName("UsedNum")
    @Expose
    private Long UsedNum;

    /**
     * Get 套餐包id 
     * @return PackageId 套餐包id
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set 套餐包id
     * @param PackageId 套餐包id
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get 套餐包名字 
     * @return PackageName 套餐包名字
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 套餐包名字
     * @param PackageName 套餐包名字
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 套餐包数量 
     * @return Num 套餐包数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 套餐包数量
     * @param Num 套餐包数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get 已使用数量 
     * @return UsedNum 已使用数量
     */
    public Long getUsedNum() {
        return this.UsedNum;
    }

    /**
     * Set 已使用数量
     * @param UsedNum 已使用数量
     */
    public void setUsedNum(Long UsedNum) {
        this.UsedNum = UsedNum;
    }

    public CloudStoragePackageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudStoragePackageInfo(CloudStoragePackageInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.UsedNum != null) {
            this.UsedNum = new Long(source.UsedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "UsedNum", this.UsedNum);

    }
}

