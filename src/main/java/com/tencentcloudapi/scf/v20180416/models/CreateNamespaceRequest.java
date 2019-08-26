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

public class CreateNamespaceRequest  extends AbstractModel{

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 命名空间描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取命名空间名称
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取命名空间描述
     * @return Description 命名空间描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置命名空间描述
     * @param Description 命名空间描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

