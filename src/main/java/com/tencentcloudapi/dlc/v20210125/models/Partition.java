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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Partition extends AbstractModel{

    /**
    * 分区列名。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 对分区的描述。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
     * Get 分区列名。 
     * @return Name 分区列名。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 分区列名。
     * @param Name 分区列名。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 分区类型。 
     * @return Type 分区类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 分区类型。
     * @param Type 分区类型。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 对分区的描述。 
     * @return Comment 对分区的描述。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 对分区的描述。
     * @param Comment 对分区的描述。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public Partition() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Partition(Partition source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Comment", this.Comment);

    }
}

