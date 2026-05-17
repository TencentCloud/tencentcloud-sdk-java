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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAssetFileIdentifyInfo extends AbstractModel {

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件路径
    */
    @SerializedName("DirName")
    @Expose
    private String DirName;

    /**
    * 分类数据项详情
    */
    @SerializedName("CategoryDetails")
    @Expose
    private CosIdentifyCategoryDetail [] CategoryDetails;

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件路径 
     * @return DirName 文件路径
     */
    public String getDirName() {
        return this.DirName;
    }

    /**
     * Set 文件路径
     * @param DirName 文件路径
     */
    public void setDirName(String DirName) {
        this.DirName = DirName;
    }

    /**
     * Get 分类数据项详情 
     * @return CategoryDetails 分类数据项详情
     */
    public CosIdentifyCategoryDetail [] getCategoryDetails() {
        return this.CategoryDetails;
    }

    /**
     * Set 分类数据项详情
     * @param CategoryDetails 分类数据项详情
     */
    public void setCategoryDetails(CosIdentifyCategoryDetail [] CategoryDetails) {
        this.CategoryDetails = CategoryDetails;
    }

    public CosAssetFileIdentifyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAssetFileIdentifyInfo(CosAssetFileIdentifyInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.DirName != null) {
            this.DirName = new String(source.DirName);
        }
        if (source.CategoryDetails != null) {
            this.CategoryDetails = new CosIdentifyCategoryDetail[source.CategoryDetails.length];
            for (int i = 0; i < source.CategoryDetails.length; i++) {
                this.CategoryDetails[i] = new CosIdentifyCategoryDetail(source.CategoryDetails[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "DirName", this.DirName);
        this.setParamArrayObj(map, prefix + "CategoryDetails.", this.CategoryDetails);

    }
}

