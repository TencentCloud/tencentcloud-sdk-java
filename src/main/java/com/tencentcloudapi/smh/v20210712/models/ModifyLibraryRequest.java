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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLibraryRequest extends AbstractModel{

    /**
    * 媒体库 ID
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 媒体库名称，最多 50 个字符。如不传则不修改。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备注，最多 250 个字符。如不传则不修改。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 媒体库配置项，部分参数在新建后不可更改，且仅修改传入的参数。如不传该参数则不修改任何配置项。
    */
    @SerializedName("LibraryExtension")
    @Expose
    private LibraryExtension LibraryExtension;

    /**
     * Get 媒体库 ID 
     * @return LibraryId 媒体库 ID
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 媒体库 ID
     * @param LibraryId 媒体库 ID
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 媒体库名称，最多 50 个字符。如不传则不修改。 
     * @return Name 媒体库名称，最多 50 个字符。如不传则不修改。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 媒体库名称，最多 50 个字符。如不传则不修改。
     * @param Name 媒体库名称，最多 50 个字符。如不传则不修改。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备注，最多 250 个字符。如不传则不修改。 
     * @return Remark 备注，最多 250 个字符。如不传则不修改。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注，最多 250 个字符。如不传则不修改。
     * @param Remark 备注，最多 250 个字符。如不传则不修改。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 媒体库配置项，部分参数在新建后不可更改，且仅修改传入的参数。如不传该参数则不修改任何配置项。 
     * @return LibraryExtension 媒体库配置项，部分参数在新建后不可更改，且仅修改传入的参数。如不传该参数则不修改任何配置项。
     */
    public LibraryExtension getLibraryExtension() {
        return this.LibraryExtension;
    }

    /**
     * Set 媒体库配置项，部分参数在新建后不可更改，且仅修改传入的参数。如不传该参数则不修改任何配置项。
     * @param LibraryExtension 媒体库配置项，部分参数在新建后不可更改，且仅修改传入的参数。如不传该参数则不修改任何配置项。
     */
    public void setLibraryExtension(LibraryExtension LibraryExtension) {
        this.LibraryExtension = LibraryExtension;
    }

    public ModifyLibraryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLibraryRequest(ModifyLibraryRequest source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.LibraryExtension != null) {
            this.LibraryExtension = new LibraryExtension(source.LibraryExtension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamObj(map, prefix + "LibraryExtension.", this.LibraryExtension);

    }
}

