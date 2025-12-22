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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetadataInfo extends AbstractModel {

    /**
    * 数据格式,rawlog/json
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * 投递字段，包括\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKG\_ID\_\_
    */
    @SerializedName("MetaFields")
    @Expose
    private String [] MetaFields;

    /**
    * 是否投递__TAG__字段
    */
    @SerializedName("EnableTag")
    @Expose
    private Boolean EnableTag;

    /**
    * JSON是否平铺，投递__TAG__字段时必填
    */
    @SerializedName("TagJsonTiled")
    @Expose
    private Boolean TagJsonTiled;

    /**
     * Get 数据格式,rawlog/json 
     * @return Format 数据格式,rawlog/json
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set 数据格式,rawlog/json
     * @param Format 数据格式,rawlog/json
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get 投递字段，包括\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKG\_ID\_\_ 
     * @return MetaFields 投递字段，包括\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKG\_ID\_\_
     */
    public String [] getMetaFields() {
        return this.MetaFields;
    }

    /**
     * Set 投递字段，包括\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKG\_ID\_\_
     * @param MetaFields 投递字段，包括\_\_SOURCE\_\_、\_\_FILENAME\_\_
、\_\_TIMESTAMP\_\_、\_\_HOSTNAME\_\_、\_\_PKG\_ID\_\_
     */
    public void setMetaFields(String [] MetaFields) {
        this.MetaFields = MetaFields;
    }

    /**
     * Get 是否投递__TAG__字段 
     * @return EnableTag 是否投递__TAG__字段
     */
    public Boolean getEnableTag() {
        return this.EnableTag;
    }

    /**
     * Set 是否投递__TAG__字段
     * @param EnableTag 是否投递__TAG__字段
     */
    public void setEnableTag(Boolean EnableTag) {
        this.EnableTag = EnableTag;
    }

    /**
     * Get JSON是否平铺，投递__TAG__字段时必填 
     * @return TagJsonTiled JSON是否平铺，投递__TAG__字段时必填
     */
    public Boolean getTagJsonTiled() {
        return this.TagJsonTiled;
    }

    /**
     * Set JSON是否平铺，投递__TAG__字段时必填
     * @param TagJsonTiled JSON是否平铺，投递__TAG__字段时必填
     */
    public void setTagJsonTiled(Boolean TagJsonTiled) {
        this.TagJsonTiled = TagJsonTiled;
    }

    public MetadataInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MetadataInfo(MetadataInfo source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.MetaFields != null) {
            this.MetaFields = new String[source.MetaFields.length];
            for (int i = 0; i < source.MetaFields.length; i++) {
                this.MetaFields[i] = new String(source.MetaFields[i]);
            }
        }
        if (source.EnableTag != null) {
            this.EnableTag = new Boolean(source.EnableTag);
        }
        if (source.TagJsonTiled != null) {
            this.TagJsonTiled = new Boolean(source.TagJsonTiled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArraySimple(map, prefix + "MetaFields.", this.MetaFields);
        this.setParamSimple(map, prefix + "EnableTag", this.EnableTag);
        this.setParamSimple(map, prefix + "TagJsonTiled", this.TagJsonTiled);

    }
}

