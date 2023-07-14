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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SnapshotOperateLog extends AbstractModel{

    /**
    * 操作类型
CreateCfsSnapshot：创建快照
DeleteCfsSnapshot：删除快照
CreateCfsFileSystem：创建文件系统
UpdateCfsSnapshotAttribute：更新快照
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 操作时间
    */
    @SerializedName("ActionTime")
    @Expose
    private String ActionTime;

    /**
    * 操作名称
CreateCfsSnapshot
DeleteCfsSnapshot
CreateCfsFileSystem
UpdateCfsSnapshotAttribute
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 操作者uin
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 1-任务进行中；2-任务成功；3-任务失败
    */
    @SerializedName("Result")
    @Expose
    private Long Result;

    /**
     * Get 操作类型
CreateCfsSnapshot：创建快照
DeleteCfsSnapshot：删除快照
CreateCfsFileSystem：创建文件系统
UpdateCfsSnapshotAttribute：更新快照 
     * @return Action 操作类型
CreateCfsSnapshot：创建快照
DeleteCfsSnapshot：删除快照
CreateCfsFileSystem：创建文件系统
UpdateCfsSnapshotAttribute：更新快照
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 操作类型
CreateCfsSnapshot：创建快照
DeleteCfsSnapshot：删除快照
CreateCfsFileSystem：创建文件系统
UpdateCfsSnapshotAttribute：更新快照
     * @param Action 操作类型
CreateCfsSnapshot：创建快照
DeleteCfsSnapshot：删除快照
CreateCfsFileSystem：创建文件系统
UpdateCfsSnapshotAttribute：更新快照
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 操作时间 
     * @return ActionTime 操作时间
     */
    public String getActionTime() {
        return this.ActionTime;
    }

    /**
     * Set 操作时间
     * @param ActionTime 操作时间
     */
    public void setActionTime(String ActionTime) {
        this.ActionTime = ActionTime;
    }

    /**
     * Get 操作名称
CreateCfsSnapshot
DeleteCfsSnapshot
CreateCfsFileSystem
UpdateCfsSnapshotAttribute 
     * @return ActionName 操作名称
CreateCfsSnapshot
DeleteCfsSnapshot
CreateCfsFileSystem
UpdateCfsSnapshotAttribute
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 操作名称
CreateCfsSnapshot
DeleteCfsSnapshot
CreateCfsFileSystem
UpdateCfsSnapshotAttribute
     * @param ActionName 操作名称
CreateCfsSnapshot
DeleteCfsSnapshot
CreateCfsFileSystem
UpdateCfsSnapshotAttribute
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 操作者uin 
     * @return Operator 操作者uin
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者uin
     * @param Operator 操作者uin
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 1-任务进行中；2-任务成功；3-任务失败 
     * @return Result 1-任务进行中；2-任务成功；3-任务失败
     */
    public Long getResult() {
        return this.Result;
    }

    /**
     * Set 1-任务进行中；2-任务成功；3-任务失败
     * @param Result 1-任务进行中；2-任务成功；3-任务失败
     */
    public void setResult(Long Result) {
        this.Result = Result;
    }

    public SnapshotOperateLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SnapshotOperateLog(SnapshotOperateLog source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.ActionTime != null) {
            this.ActionTime = new String(source.ActionTime);
        }
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Result != null) {
            this.Result = new Long(source.Result);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "ActionTime", this.ActionTime);
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "Result", this.Result);

    }
}

