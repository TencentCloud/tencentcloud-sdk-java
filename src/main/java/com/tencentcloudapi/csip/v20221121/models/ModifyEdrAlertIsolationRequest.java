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

public class ModifyEdrAlertIsolationRequest extends AbstractModel {

    /**
    * <p>告警定位列表（1-500）</p>
    */
    @SerializedName("Targets")
    @Expose
    private EdrAlertTarget [] Targets;

    /**
    * <p>操作类型：Isolate（隔离）/ RestoreIsolate（恢复隔离）/ KillProcess（进程查杀）枚举值：Isolate： 隔离RestoreIsolate： 恢复隔离KillProcess： 进程查杀</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>是否终止关联进程，仅 Status=Isolate 有效，Status=KillProcess 时忽略</p>
    */
    @SerializedName("KillProcess")
    @Expose
    private Boolean KillProcess;

    /**
     * Get <p>告警定位列表（1-500）</p> 
     * @return Targets <p>告警定位列表（1-500）</p>
     */
    public EdrAlertTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set <p>告警定位列表（1-500）</p>
     * @param Targets <p>告警定位列表（1-500）</p>
     */
    public void setTargets(EdrAlertTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get <p>操作类型：Isolate（隔离）/ RestoreIsolate（恢复隔离）/ KillProcess（进程查杀）枚举值：Isolate： 隔离RestoreIsolate： 恢复隔离KillProcess： 进程查杀</p> 
     * @return Status <p>操作类型：Isolate（隔离）/ RestoreIsolate（恢复隔离）/ KillProcess（进程查杀）枚举值：Isolate： 隔离RestoreIsolate： 恢复隔离KillProcess： 进程查杀</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>操作类型：Isolate（隔离）/ RestoreIsolate（恢复隔离）/ KillProcess（进程查杀）枚举值：Isolate： 隔离RestoreIsolate： 恢复隔离KillProcess： 进程查杀</p>
     * @param Status <p>操作类型：Isolate（隔离）/ RestoreIsolate（恢复隔离）/ KillProcess（进程查杀）枚举值：Isolate： 隔离RestoreIsolate： 恢复隔离KillProcess： 进程查杀</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>是否终止关联进程，仅 Status=Isolate 有效，Status=KillProcess 时忽略</p> 
     * @return KillProcess <p>是否终止关联进程，仅 Status=Isolate 有效，Status=KillProcess 时忽略</p>
     */
    public Boolean getKillProcess() {
        return this.KillProcess;
    }

    /**
     * Set <p>是否终止关联进程，仅 Status=Isolate 有效，Status=KillProcess 时忽略</p>
     * @param KillProcess <p>是否终止关联进程，仅 Status=Isolate 有效，Status=KillProcess 时忽略</p>
     */
    public void setKillProcess(Boolean KillProcess) {
        this.KillProcess = KillProcess;
    }

    public ModifyEdrAlertIsolationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyEdrAlertIsolationRequest(ModifyEdrAlertIsolationRequest source) {
        if (source.Targets != null) {
            this.Targets = new EdrAlertTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new EdrAlertTarget(source.Targets[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.KillProcess != null) {
            this.KillProcess = new Boolean(source.KillProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "KillProcess", this.KillProcess);

    }
}

