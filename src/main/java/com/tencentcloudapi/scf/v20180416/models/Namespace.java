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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Namespace extends AbstractModel{

    /**
    * 命名空间创建时间
    */
    @SerializedName("ModTime")
    @Expose
    private String ModTime;

    /**
    * 命名空间修改时间
    */
    @SerializedName("AddTime")
    @Expose
    private String AddTime;

    /**
    * 命名空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 命名空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 默认default，TCB表示是小程序云开发创建的
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 命名空间创建时间 
     * @return ModTime 命名空间创建时间
     */
    public String getModTime() {
        return this.ModTime;
    }

    /**
     * Set 命名空间创建时间
     * @param ModTime 命名空间创建时间
     */
    public void setModTime(String ModTime) {
        this.ModTime = ModTime;
    }

    /**
     * Get 命名空间修改时间 
     * @return AddTime 命名空间修改时间
     */
    public String getAddTime() {
        return this.AddTime;
    }

    /**
     * Set 命名空间修改时间
     * @param AddTime 命名空间修改时间
     */
    public void setAddTime(String AddTime) {
        this.AddTime = AddTime;
    }

    /**
     * Get 命名空间描述 
     * @return Description 命名空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 命名空间描述
     * @param Description 命名空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 命名空间名称 
     * @return Name 命名空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名称
     * @param Name 命名空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 默认default，TCB表示是小程序云开发创建的 
     * @return Type 默认default，TCB表示是小程序云开发创建的
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 默认default，TCB表示是小程序云开发创建的
     * @param Type 默认default，TCB表示是小程序云开发创建的
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModTime", this.ModTime);
        this.setParamSimple(map, prefix + "AddTime", this.AddTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

