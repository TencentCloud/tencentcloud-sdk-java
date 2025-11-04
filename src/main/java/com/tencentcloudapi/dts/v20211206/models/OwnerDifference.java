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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OwnerDifference extends AbstractModel {

    /**
    * owner不一致的pg对象所在库
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * owner不一致的pg对象所在schema
    */
    @SerializedName("Schema")
    @Expose
    private String Schema;

    /**
    * owner不一致的pg对象名
    */
    @SerializedName("ObjectName")
    @Expose
    private String ObjectName;

    /**
    * owner不一致的pg对象类型
    */
    @SerializedName("ObjectType")
    @Expose
    private String ObjectType;

    /**
    * 源库对象owner
    */
    @SerializedName("SrcOwner")
    @Expose
    private String SrcOwner;

    /**
    * 目标库对象owner
    */
    @SerializedName("DstOwner")
    @Expose
    private String DstOwner;

    /**
     * Get owner不一致的pg对象所在库 
     * @return Db owner不一致的pg对象所在库
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set owner不一致的pg对象所在库
     * @param Db owner不一致的pg对象所在库
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get owner不一致的pg对象所在schema 
     * @return Schema owner不一致的pg对象所在schema
     */
    public String getSchema() {
        return this.Schema;
    }

    /**
     * Set owner不一致的pg对象所在schema
     * @param Schema owner不一致的pg对象所在schema
     */
    public void setSchema(String Schema) {
        this.Schema = Schema;
    }

    /**
     * Get owner不一致的pg对象名 
     * @return ObjectName owner不一致的pg对象名
     */
    public String getObjectName() {
        return this.ObjectName;
    }

    /**
     * Set owner不一致的pg对象名
     * @param ObjectName owner不一致的pg对象名
     */
    public void setObjectName(String ObjectName) {
        this.ObjectName = ObjectName;
    }

    /**
     * Get owner不一致的pg对象类型 
     * @return ObjectType owner不一致的pg对象类型
     */
    public String getObjectType() {
        return this.ObjectType;
    }

    /**
     * Set owner不一致的pg对象类型
     * @param ObjectType owner不一致的pg对象类型
     */
    public void setObjectType(String ObjectType) {
        this.ObjectType = ObjectType;
    }

    /**
     * Get 源库对象owner 
     * @return SrcOwner 源库对象owner
     */
    public String getSrcOwner() {
        return this.SrcOwner;
    }

    /**
     * Set 源库对象owner
     * @param SrcOwner 源库对象owner
     */
    public void setSrcOwner(String SrcOwner) {
        this.SrcOwner = SrcOwner;
    }

    /**
     * Get 目标库对象owner 
     * @return DstOwner 目标库对象owner
     */
    public String getDstOwner() {
        return this.DstOwner;
    }

    /**
     * Set 目标库对象owner
     * @param DstOwner 目标库对象owner
     */
    public void setDstOwner(String DstOwner) {
        this.DstOwner = DstOwner;
    }

    public OwnerDifference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OwnerDifference(OwnerDifference source) {
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.Schema != null) {
            this.Schema = new String(source.Schema);
        }
        if (source.ObjectName != null) {
            this.ObjectName = new String(source.ObjectName);
        }
        if (source.ObjectType != null) {
            this.ObjectType = new String(source.ObjectType);
        }
        if (source.SrcOwner != null) {
            this.SrcOwner = new String(source.SrcOwner);
        }
        if (source.DstOwner != null) {
            this.DstOwner = new String(source.DstOwner);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "Schema", this.Schema);
        this.setParamSimple(map, prefix + "ObjectName", this.ObjectName);
        this.setParamSimple(map, prefix + "ObjectType", this.ObjectType);
        this.setParamSimple(map, prefix + "SrcOwner", this.SrcOwner);
        this.setParamSimple(map, prefix + "DstOwner", this.DstOwner);

    }
}

