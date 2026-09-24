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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RangePartition extends AbstractModel {

    /**
    * <p>分区名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>下界</p>
    */
    @SerializedName("Lower")
    @Expose
    private Literal Lower;

    /**
    * <p>上界</p>
    */
    @SerializedName("Upper")
    @Expose
    private Literal Upper;

    /**
    * <p>属性</p>
    */
    @SerializedName("Properties")
    @Expose
    private KVPair [] Properties;

    /**
     * Get <p>分区名</p> 
     * @return Name <p>分区名</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>分区名</p>
     * @param Name <p>分区名</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>下界</p> 
     * @return Lower <p>下界</p>
     */
    public Literal getLower() {
        return this.Lower;
    }

    /**
     * Set <p>下界</p>
     * @param Lower <p>下界</p>
     */
    public void setLower(Literal Lower) {
        this.Lower = Lower;
    }

    /**
     * Get <p>上界</p> 
     * @return Upper <p>上界</p>
     */
    public Literal getUpper() {
        return this.Upper;
    }

    /**
     * Set <p>上界</p>
     * @param Upper <p>上界</p>
     */
    public void setUpper(Literal Upper) {
        this.Upper = Upper;
    }

    /**
     * Get <p>属性</p> 
     * @return Properties <p>属性</p>
     */
    public KVPair [] getProperties() {
        return this.Properties;
    }

    /**
     * Set <p>属性</p>
     * @param Properties <p>属性</p>
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

