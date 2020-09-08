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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenameRestoreDatabase extends AbstractModel{

    /**
    * 库的名字，如果oldName不存在则返回失败。
在用于离线迁移任务时可不填。
    */
    @SerializedName("OldName")
    @Expose
    private String OldName;

    /**
    * 库的新名字，如果不填则按照系统默认方式命名恢复的库。在用于离线迁移任务时，不填则按照OldName命名，OldName和NewName不能同时不填。
    */
    @SerializedName("NewName")
    @Expose
    private String NewName;

    /**
     * Get 库的名字，如果oldName不存在则返回失败。
在用于离线迁移任务时可不填。 
     * @return OldName 库的名字，如果oldName不存在则返回失败。
在用于离线迁移任务时可不填。
     */
    public String getOldName() {
        return this.OldName;
    }

    /**
     * Set 库的名字，如果oldName不存在则返回失败。
在用于离线迁移任务时可不填。
     * @param OldName 库的名字，如果oldName不存在则返回失败。
在用于离线迁移任务时可不填。
     */
    public void setOldName(String OldName) {
        this.OldName = OldName;
    }

    /**
     * Get 库的新名字，如果不填则按照系统默认方式命名恢复的库。在用于离线迁移任务时，不填则按照OldName命名，OldName和NewName不能同时不填。 
     * @return NewName 库的新名字，如果不填则按照系统默认方式命名恢复的库。在用于离线迁移任务时，不填则按照OldName命名，OldName和NewName不能同时不填。
     */
    public String getNewName() {
        return this.NewName;
    }

    /**
     * Set 库的新名字，如果不填则按照系统默认方式命名恢复的库。在用于离线迁移任务时，不填则按照OldName命名，OldName和NewName不能同时不填。
     * @param NewName 库的新名字，如果不填则按照系统默认方式命名恢复的库。在用于离线迁移任务时，不填则按照OldName命名，OldName和NewName不能同时不填。
     */
    public void setNewName(String NewName) {
        this.NewName = NewName;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OldName", this.OldName);
        this.setParamSimple(map, prefix + "NewName", this.NewName);

    }
}

