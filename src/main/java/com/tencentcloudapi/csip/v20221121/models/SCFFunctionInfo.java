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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SCFFunctionInfo extends AbstractModel {

    /**
    * 函数 ID
参数格式：形如 lam-xxxxxxxx
    */
    @SerializedName("FunctionId")
    @Expose
    private String FunctionId;

    /**
    * 函数名称
    */
    @SerializedName("FunctionName")
    @Expose
    private String FunctionName;

    /**
    * 命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 函数状态
枚举值：
Active：可用
Creating：创建中
Updating：更新中
CreateFailed：创建失败
Deleting：删除中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 函数类型
枚举值：
Event：事件函数（当前接口仅返回该类型）
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 函数 ID
参数格式：形如 lam-xxxxxxxx 
     * @return FunctionId 函数 ID
参数格式：形如 lam-xxxxxxxx
     */
    public String getFunctionId() {
        return this.FunctionId;
    }

    /**
     * Set 函数 ID
参数格式：形如 lam-xxxxxxxx
     * @param FunctionId 函数 ID
参数格式：形如 lam-xxxxxxxx
     */
    public void setFunctionId(String FunctionId) {
        this.FunctionId = FunctionId;
    }

    /**
     * Get 函数名称 
     * @return FunctionName 函数名称
     */
    public String getFunctionName() {
        return this.FunctionName;
    }

    /**
     * Set 函数名称
     * @param FunctionName 函数名称
     */
    public void setFunctionName(String FunctionName) {
        this.FunctionName = FunctionName;
    }

    /**
     * Get 命名空间 
     * @return Namespace 命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间
     * @param Namespace 命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 函数状态
枚举值：
Active：可用
Creating：创建中
Updating：更新中
CreateFailed：创建失败
Deleting：删除中 
     * @return Status 函数状态
枚举值：
Active：可用
Creating：创建中
Updating：更新中
CreateFailed：创建失败
Deleting：删除中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 函数状态
枚举值：
Active：可用
Creating：创建中
Updating：更新中
CreateFailed：创建失败
Deleting：删除中
     * @param Status 函数状态
枚举值：
Active：可用
Creating：创建中
Updating：更新中
CreateFailed：创建失败
Deleting：删除中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 函数类型
枚举值：
Event：事件函数（当前接口仅返回该类型） 
     * @return Type 函数类型
枚举值：
Event：事件函数（当前接口仅返回该类型）
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 函数类型
枚举值：
Event：事件函数（当前接口仅返回该类型）
     * @param Type 函数类型
枚举值：
Event：事件函数（当前接口仅返回该类型）
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public SCFFunctionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SCFFunctionInfo(SCFFunctionInfo source) {
        if (source.FunctionId != null) {
            this.FunctionId = new String(source.FunctionId);
        }
        if (source.FunctionName != null) {
            this.FunctionName = new String(source.FunctionName);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FunctionId", this.FunctionId);
        this.setParamSimple(map, prefix + "FunctionName", this.FunctionName);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

