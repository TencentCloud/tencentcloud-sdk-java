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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FeatureLookup extends AbstractModel {

    /**
    * 特征表全名
    */
    @SerializedName("TableName")
    @Expose
    private String TableName;

    /**
    * 关联键
    */
    @SerializedName("LookupKey")
    @Expose
    private String [] LookupKey;

    /**
    * 时间戳关联键
    */
    @SerializedName("TimestampLookupKey")
    @Expose
    private String TimestampLookupKey;

    /**
    * 特征列名列表
    */
    @SerializedName("FeatureNames")
    @Expose
    private String [] FeatureNames;

    /**
     * Get 特征表全名 
     * @return TableName 特征表全名
     */
    public String getTableName() {
        return this.TableName;
    }

    /**
     * Set 特征表全名
     * @param TableName 特征表全名
     */
    public void setTableName(String TableName) {
        this.TableName = TableName;
    }

    /**
     * Get 关联键 
     * @return LookupKey 关联键
     */
    public String [] getLookupKey() {
        return this.LookupKey;
    }

    /**
     * Set 关联键
     * @param LookupKey 关联键
     */
    public void setLookupKey(String [] LookupKey) {
        this.LookupKey = LookupKey;
    }

    /**
     * Get 时间戳关联键 
     * @return TimestampLookupKey 时间戳关联键
     */
    public String getTimestampLookupKey() {
        return this.TimestampLookupKey;
    }

    /**
     * Set 时间戳关联键
     * @param TimestampLookupKey 时间戳关联键
     */
    public void setTimestampLookupKey(String TimestampLookupKey) {
        this.TimestampLookupKey = TimestampLookupKey;
    }

    /**
     * Get 特征列名列表 
     * @return FeatureNames 特征列名列表
     */
    public String [] getFeatureNames() {
        return this.FeatureNames;
    }

    /**
     * Set 特征列名列表
     * @param FeatureNames 特征列名列表
     */
    public void setFeatureNames(String [] FeatureNames) {
        this.FeatureNames = FeatureNames;
    }

    public FeatureLookup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FeatureLookup(FeatureLookup source) {
        if (source.TableName != null) {
            this.TableName = new String(source.TableName);
        }
        if (source.LookupKey != null) {
            this.LookupKey = new String[source.LookupKey.length];
            for (int i = 0; i < source.LookupKey.length; i++) {
                this.LookupKey[i] = new String(source.LookupKey[i]);
            }
        }
        if (source.TimestampLookupKey != null) {
            this.TimestampLookupKey = new String(source.TimestampLookupKey);
        }
        if (source.FeatureNames != null) {
            this.FeatureNames = new String[source.FeatureNames.length];
            for (int i = 0; i < source.FeatureNames.length; i++) {
                this.FeatureNames[i] = new String(source.FeatureNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TableName", this.TableName);
        this.setParamArraySimple(map, prefix + "LookupKey.", this.LookupKey);
        this.setParamSimple(map, prefix + "TimestampLookupKey", this.TimestampLookupKey);
        this.setParamArraySimple(map, prefix + "FeatureNames.", this.FeatureNames);

    }
}

