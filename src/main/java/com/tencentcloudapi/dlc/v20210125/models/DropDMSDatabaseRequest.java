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

public class DropDMSDatabaseRequest extends AbstractModel{

    /**
    * 数据库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 是否删除数据
    */
    @SerializedName("DeleteData")
    @Expose
    private Boolean DeleteData;

    /**
    * 是否级联删除
    */
    @SerializedName("Cascade")
    @Expose
    private Boolean Cascade;

    /**
     * Get 数据库名称 
     * @return Name 数据库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据库名称
     * @param Name 数据库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 是否删除数据 
     * @return DeleteData 是否删除数据
     */
    public Boolean getDeleteData() {
        return this.DeleteData;
    }

    /**
     * Set 是否删除数据
     * @param DeleteData 是否删除数据
     */
    public void setDeleteData(Boolean DeleteData) {
        this.DeleteData = DeleteData;
    }

    /**
     * Get 是否级联删除 
     * @return Cascade 是否级联删除
     */
    public Boolean getCascade() {
        return this.Cascade;
    }

    /**
     * Set 是否级联删除
     * @param Cascade 是否级联删除
     */
    public void setCascade(Boolean Cascade) {
        this.Cascade = Cascade;
    }

    public DropDMSDatabaseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropDMSDatabaseRequest(DropDMSDatabaseRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DeleteData != null) {
            this.DeleteData = new Boolean(source.DeleteData);
        }
        if (source.Cascade != null) {
            this.Cascade = new Boolean(source.Cascade);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DeleteData", this.DeleteData);
        this.setParamSimple(map, prefix + "Cascade", this.Cascade);

    }
}

