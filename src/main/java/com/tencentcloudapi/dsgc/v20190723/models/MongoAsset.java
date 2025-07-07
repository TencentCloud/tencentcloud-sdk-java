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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MongoAsset extends AbstractModel {

    /**
    * DB总数量
    */
    @SerializedName("DbNums")
    @Expose
    private Long DbNums;

    /**
    * 敏感DB数量
    */
    @SerializedName("SensitiveDbNums")
    @Expose
    private Long SensitiveDbNums;

    /**
    * 集合数量
    */
    @SerializedName("ColNums")
    @Expose
    private Long ColNums;

    /**
    * 敏感集合的数量
    */
    @SerializedName("SensitiveColNums")
    @Expose
    private Long SensitiveColNums;

    /**
    * 字段数量
    */
    @SerializedName("FieldNums")
    @Expose
    private Long FieldNums;

    /**
    * 敏感的字段数量
    */
    @SerializedName("SensitiveFieldNums")
    @Expose
    private Long SensitiveFieldNums;

    /**
     * Get DB总数量 
     * @return DbNums DB总数量
     */
    public Long getDbNums() {
        return this.DbNums;
    }

    /**
     * Set DB总数量
     * @param DbNums DB总数量
     */
    public void setDbNums(Long DbNums) {
        this.DbNums = DbNums;
    }

    /**
     * Get 敏感DB数量 
     * @return SensitiveDbNums 敏感DB数量
     */
    public Long getSensitiveDbNums() {
        return this.SensitiveDbNums;
    }

    /**
     * Set 敏感DB数量
     * @param SensitiveDbNums 敏感DB数量
     */
    public void setSensitiveDbNums(Long SensitiveDbNums) {
        this.SensitiveDbNums = SensitiveDbNums;
    }

    /**
     * Get 集合数量 
     * @return ColNums 集合数量
     */
    public Long getColNums() {
        return this.ColNums;
    }

    /**
     * Set 集合数量
     * @param ColNums 集合数量
     */
    public void setColNums(Long ColNums) {
        this.ColNums = ColNums;
    }

    /**
     * Get 敏感集合的数量 
     * @return SensitiveColNums 敏感集合的数量
     */
    public Long getSensitiveColNums() {
        return this.SensitiveColNums;
    }

    /**
     * Set 敏感集合的数量
     * @param SensitiveColNums 敏感集合的数量
     */
    public void setSensitiveColNums(Long SensitiveColNums) {
        this.SensitiveColNums = SensitiveColNums;
    }

    /**
     * Get 字段数量 
     * @return FieldNums 字段数量
     */
    public Long getFieldNums() {
        return this.FieldNums;
    }

    /**
     * Set 字段数量
     * @param FieldNums 字段数量
     */
    public void setFieldNums(Long FieldNums) {
        this.FieldNums = FieldNums;
    }

    /**
     * Get 敏感的字段数量 
     * @return SensitiveFieldNums 敏感的字段数量
     */
    public Long getSensitiveFieldNums() {
        return this.SensitiveFieldNums;
    }

    /**
     * Set 敏感的字段数量
     * @param SensitiveFieldNums 敏感的字段数量
     */
    public void setSensitiveFieldNums(Long SensitiveFieldNums) {
        this.SensitiveFieldNums = SensitiveFieldNums;
    }

    public MongoAsset() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MongoAsset(MongoAsset source) {
        if (source.DbNums != null) {
            this.DbNums = new Long(source.DbNums);
        }
        if (source.SensitiveDbNums != null) {
            this.SensitiveDbNums = new Long(source.SensitiveDbNums);
        }
        if (source.ColNums != null) {
            this.ColNums = new Long(source.ColNums);
        }
        if (source.SensitiveColNums != null) {
            this.SensitiveColNums = new Long(source.SensitiveColNums);
        }
        if (source.FieldNums != null) {
            this.FieldNums = new Long(source.FieldNums);
        }
        if (source.SensitiveFieldNums != null) {
            this.SensitiveFieldNums = new Long(source.SensitiveFieldNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DbNums", this.DbNums);
        this.setParamSimple(map, prefix + "SensitiveDbNums", this.SensitiveDbNums);
        this.setParamSimple(map, prefix + "ColNums", this.ColNums);
        this.setParamSimple(map, prefix + "SensitiveColNums", this.SensitiveColNums);
        this.setParamSimple(map, prefix + "FieldNums", this.FieldNums);
        this.setParamSimple(map, prefix + "SensitiveFieldNums", this.SensitiveFieldNums);

    }
}

