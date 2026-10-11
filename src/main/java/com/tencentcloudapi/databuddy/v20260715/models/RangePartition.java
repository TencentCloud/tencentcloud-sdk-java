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

public class RangePartition extends AbstractModel {

    /**
    * 分区名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 下界
    */
    @SerializedName("Lower")
    @Expose
    private Literal Lower;

    /**
    * 上界
    */
    @SerializedName("Upper")
    @Expose
    private Literal Upper;

    /**
    * 属性
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
     * Get 分区名 
     * @return Name 分区名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区名
     * @param Name 分区名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 下界 
     * @return Lower 下界
     */
    public Literal getLower() {
        return this.Lower;
    }

    /**
     * Set 下界
     * @param Lower 下界
     */
    public void setLower(Literal Lower) {
        this.Lower = Lower;
    }

    /**
     * Get 上界 
     * @return Upper 上界
     */
    public Literal getUpper() {
        return this.Upper;
    }

    /**
     * Set 上界
     * @param Upper 上界
     */
    public void setUpper(Literal Upper) {
        this.Upper = Upper;
    }

    /**
     * Get 属性 
     * @return Properties 属性
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set 属性
     * @param Properties 属性
     */
    public void setProperties(KVPair [] Properties) {
        this.Properties = Properties;
    }

    public RangePartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RangePartition(RangePartition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Lower != null) {
            this.Lower = new Literal(source.Lower);
        }
        if (source.Upper != null) {
            this.Upper = new Literal(source.Upper);
        }
        if (source.Properties != null) {
            this.Properties = new KVPair[source.Properties.length];
            for (int i = 0; i < source.Properties.length; i++) {
                this.Properties[i] = new KVPair(source.Properties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Lower.", this.Lower);
        this.setParamObj(map, prefix + "Upper.", this.Upper);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

