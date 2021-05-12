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

public class MigrationAction extends AbstractModel{

    /**
    * 支持的所有操作，值包括：view(查看任务) ，modify(修改任务)， start(启动任务)，incremental(创建增量任务)，delete(删除任务)，upload(获取上传权限)。
    */
    @SerializedName("AllAction")
    @Expose
    private String [] AllAction;

    /**
    * 当前状态允许的操作，AllAction的子集,为空表示禁止所有操作
    */
    @SerializedName("AllowedAction")
    @Expose
    private String [] AllowedAction;

    /**
     * Get 支持的所有操作，值包括：view(查看任务) ，modify(修改任务)， start(启动任务)，incremental(创建增量任务)，delete(删除任务)，upload(获取上传权限)。 
     * @return AllAction 支持的所有操作，值包括：view(查看任务) ，modify(修改任务)， start(启动任务)，incremental(创建增量任务)，delete(删除任务)，upload(获取上传权限)。
     */
    public String [] getAllAction() {
        return this.AllAction;
    }

    /**
     * Set 支持的所有操作，值包括：view(查看任务) ，modify(修改任务)， start(启动任务)，incremental(创建增量任务)，delete(删除任务)，upload(获取上传权限)。
     * @param AllAction 支持的所有操作，值包括：view(查看任务) ，modify(修改任务)， start(启动任务)，incremental(创建增量任务)，delete(删除任务)，upload(获取上传权限)。
     */
    public void setAllAction(String [] AllAction) {
        this.AllAction = AllAction;
    }

    /**
     * Get 当前状态允许的操作，AllAction的子集,为空表示禁止所有操作 
     * @return AllowedAction 当前状态允许的操作，AllAction的子集,为空表示禁止所有操作
     */
    public String [] getAllowedAction() {
        return this.AllowedAction;
    }

    /**
     * Set 当前状态允许的操作，AllAction的子集,为空表示禁止所有操作
     * @param AllowedAction 当前状态允许的操作，AllAction的子集,为空表示禁止所有操作
     */
    public void setAllowedAction(String [] AllowedAction) {
        this.AllowedAction = AllowedAction;
    }

    public MigrationAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrationAction(MigrationAction source) {
        if (source.AllAction != null) {
            this.AllAction = new String[source.AllAction.length];
            for (int i = 0; i < source.AllAction.length; i++) {
                this.AllAction[i] = new String(source.AllAction[i]);
            }
        }
        if (source.AllowedAction != null) {
            this.AllowedAction = new String[source.AllowedAction.length];
            for (int i = 0; i < source.AllowedAction.length; i++) {
                this.AllowedAction[i] = new String(source.AllowedAction[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AllAction.", this.AllAction);
        this.setParamArraySimple(map, prefix + "AllowedAction.", this.AllowedAction);

    }
}

