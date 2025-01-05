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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopHotKeys extends AbstractModel {

    /**
    * 访问频次。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 热Key所属数据库。
    */
    @SerializedName("Db")
    @Expose
    private String Db;

    /**
    * Redis节点。
    */
    @SerializedName("InstanceNodeId")
    @Expose
    private String InstanceNodeId;

    /**
    * 热Key。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 数据类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 访问频次。 
     * @return Count 访问频次。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 访问频次。
     * @param Count 访问频次。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 热Key所属数据库。 
     * @return Db 热Key所属数据库。
     */
    public String getDb() {
        return this.Db;
    }

    /**
     * Set 热Key所属数据库。
     * @param Db 热Key所属数据库。
     */
    public void setDb(String Db) {
        this.Db = Db;
    }

    /**
     * Get Redis节点。 
     * @return InstanceNodeId Redis节点。
     */
    public String getInstanceNodeId() {
        return this.InstanceNodeId;
    }

    /**
     * Set Redis节点。
     * @param InstanceNodeId Redis节点。
     */
    public void setInstanceNodeId(String InstanceNodeId) {
        this.InstanceNodeId = InstanceNodeId;
    }

    /**
     * Get 热Key。 
     * @return Key 热Key。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 热Key。
     * @param Key 热Key。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 数据类型。 
     * @return Type 数据类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据类型。
     * @param Type 数据类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public TopHotKeys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopHotKeys(TopHotKeys source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Db != null) {
            this.Db = new String(source.Db);
        }
        if (source.InstanceNodeId != null) {
            this.InstanceNodeId = new String(source.InstanceNodeId);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Db", this.Db);
        this.setParamSimple(map, prefix + "InstanceNodeId", this.InstanceNodeId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

