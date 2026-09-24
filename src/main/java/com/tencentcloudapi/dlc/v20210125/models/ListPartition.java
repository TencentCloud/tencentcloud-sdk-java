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

public class ListPartition extends AbstractModel {

    /**
    * <p>分区名</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>分区列表</p>
    */
    @SerializedName("Lists")
    @Expose
    private Literal [] Lists;

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
     * Get <p>分区列表</p> 
     * @return Lists <p>分区列表</p>
     */
    public Literal [] getLists() {
        return this.Lists;
    }

    /**
     * Set <p>分区列表</p>
     * @param Lists <p>分区列表</p>
     */
    public void setLists(Literal [] Lists) {
        this.Lists = Lists;
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

    public ListPartition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPartition(ListPartition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Lists != null) {
            this.Lists = new Literal[source.Lists.length];
            for (int i = 0; i < source.Lists.length; i++) {
                this.Lists[i] = new Literal(source.Lists[i]);
            }
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
        this.setParamArrayObj(map, prefix + "Lists.", this.Lists);
        this.setParamArrayObj(map, prefix + "Properties.", this.Properties);

    }
}

