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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MgoKeySchema extends AbstractModel {

    /**
    * <p>索引字段</p>
    */
    @SerializedName("MgoIndexKeys")
    @Expose
    private MgoIndexKeys [] MgoIndexKeys;

    /**
    * <p>是否唯一索引</p>
    */
    @SerializedName("MgoIsUnique")
    @Expose
    private Boolean MgoIsUnique;

    /**
    * <p>是否稀疏索引</p>
    */
    @SerializedName("MgoIsSparse")
    @Expose
    private Boolean MgoIsSparse;

    /**
    * <p>稀疏索引表达式</p>
    */
    @SerializedName("PartialFilterExpression")
    @Expose
    private String PartialFilterExpression;

    /**
     * Get <p>索引字段</p> 
     * @return MgoIndexKeys <p>索引字段</p>
     */
    public MgoIndexKeys [] getMgoIndexKeys() {
        return this.MgoIndexKeys;
    }

    /**
     * Set <p>索引字段</p>
     * @param MgoIndexKeys <p>索引字段</p>
     */
    public void setMgoIndexKeys(MgoIndexKeys [] MgoIndexKeys) {
        this.MgoIndexKeys = MgoIndexKeys;
    }

    /**
     * Get <p>是否唯一索引</p> 
     * @return MgoIsUnique <p>是否唯一索引</p>
     */
    public Boolean getMgoIsUnique() {
        return this.MgoIsUnique;
    }

    /**
     * Set <p>是否唯一索引</p>
     * @param MgoIsUnique <p>是否唯一索引</p>
     */
    public void setMgoIsUnique(Boolean MgoIsUnique) {
        this.MgoIsUnique = MgoIsUnique;
    }

    /**
     * Get <p>是否稀疏索引</p> 
     * @return MgoIsSparse <p>是否稀疏索引</p>
     */
    public Boolean getMgoIsSparse() {
        return this.MgoIsSparse;
    }

    /**
     * Set <p>是否稀疏索引</p>
     * @param MgoIsSparse <p>是否稀疏索引</p>
     */
    public void setMgoIsSparse(Boolean MgoIsSparse) {
        this.MgoIsSparse = MgoIsSparse;
    }

    /**
     * Get <p>稀疏索引表达式</p> 
     * @return PartialFilterExpression <p>稀疏索引表达式</p>
     */
    public String getPartialFilterExpression() {
        return this.PartialFilterExpression;
    }

    /**
     * Set <p>稀疏索引表达式</p>
     * @param PartialFilterExpression <p>稀疏索引表达式</p>
     */
    public void setPartialFilterExpression(String PartialFilterExpression) {
        this.PartialFilterExpression = PartialFilterExpression;
    }

    public MgoKeySchema() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MgoKeySchema(MgoKeySchema source) {
        if (source.MgoIndexKeys != null) {
            this.MgoIndexKeys = new MgoIndexKeys[source.MgoIndexKeys.length];
            for (int i = 0; i < source.MgoIndexKeys.length; i++) {
                this.MgoIndexKeys[i] = new MgoIndexKeys(source.MgoIndexKeys[i]);
            }
        }
        if (source.MgoIsUnique != null) {
            this.MgoIsUnique = new Boolean(source.MgoIsUnique);
        }
        if (source.MgoIsSparse != null) {
            this.MgoIsSparse = new Boolean(source.MgoIsSparse);
        }
        if (source.PartialFilterExpression != null) {
            this.PartialFilterExpression = new String(source.PartialFilterExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MgoIndexKeys.", this.MgoIndexKeys);
        this.setParamSimple(map, prefix + "MgoIsUnique", this.MgoIsUnique);
        this.setParamSimple(map, prefix + "MgoIsSparse", this.MgoIsSparse);
        this.setParamSimple(map, prefix + "PartialFilterExpression", this.PartialFilterExpression);

    }
}

