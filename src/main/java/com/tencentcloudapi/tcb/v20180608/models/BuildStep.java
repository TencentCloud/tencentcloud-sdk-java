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

public class BuildStep extends AbstractModel {

    /**
    * <p>步骤名（建议 kebab-case，如 build-image），出现在 DescribeCloudAppVersion.Steps[].Name</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>shell 脚本，支持单行或多行</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
     * Get <p>步骤名（建议 kebab-case，如 build-image），出现在 DescribeCloudAppVersion.Steps[].Name</p> 
     * @return Name <p>步骤名（建议 kebab-case，如 build-image），出现在 DescribeCloudAppVersion.Steps[].Name</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>步骤名（建议 kebab-case，如 build-image），出现在 DescribeCloudAppVersion.Steps[].Name</p>
     * @param Name <p>步骤名（建议 kebab-case，如 build-image），出现在 DescribeCloudAppVersion.Steps[].Name</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>shell 脚本，支持单行或多行</p> 
     * @return Command <p>shell 脚本，支持单行或多行</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>shell 脚本，支持单行或多行</p>
     * @param Command <p>shell 脚本，支持单行或多行</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    public BuildStep() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BuildStep(BuildStep source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Command", this.Command);

    }
}

