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
package com.tencentcloudapi.dbs.v20211108.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConnectTestResult extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * <p>任务状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>是否通过。0 表示未通过，1 表示通过。</p>
    */
    @SerializedName("IsPass")
    @Expose
    private Long IsPass;

    /**
    * <p>源端地址</p>
    */
    @SerializedName("Addr")
    @Expose
    private String Addr;

    /**
    * <p>源地址转换IP</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SNatIp")
    @Expose
    private String SNatIp;

    /**
    * <p>检测结果集</p>
    */
    @SerializedName("TestItems")
    @Expose
    private TestItem [] TestItems;

    /**
     * Get <p>任务 ID</p> 
     * @return TaskId <p>任务 ID</p>
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param TaskId <p>任务 ID</p>
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get <p>任务状态</p> 
     * @return Status <p>任务状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态</p>
     * @param Status <p>任务状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否通过。0 表示未通过，1 表示通过。</p> 
     * @return IsPass <p>是否通过。0 表示未通过，1 表示通过。</p>
     */
    public Long getIsPass() {
        return this.IsPass;
    }

    /**
     * Set <p>是否通过。0 表示未通过，1 表示通过。</p>
     * @param IsPass <p>是否通过。0 表示未通过，1 表示通过。</p>
     */
    public void setIsPass(Long IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get <p>源端地址</p> 
     * @return Addr <p>源端地址</p>
     */
    public String getAddr() {
        return this.Addr;
    }

    /**
     * Set <p>源端地址</p>
     * @param Addr <p>源端地址</p>
     */
    public void setAddr(String Addr) {
        this.Addr = Addr;
    }

    /**
     * Get <p>源地址转换IP</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SNatIp <p>源地址转换IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSNatIp() {
        return this.SNatIp;
    }

    /**
     * Set <p>源地址转换IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SNatIp <p>源地址转换IP</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSNatIp(String SNatIp) {
        this.SNatIp = SNatIp;
    }

    /**
     * Get <p>检测结果集</p> 
     * @return TestItems <p>检测结果集</p>
     */
    public TestItem [] getTestItems() {
        return this.TestItems;
    }

    /**
     * Set <p>检测结果集</p>
     * @param TestItems <p>检测结果集</p>
     */
    public void setTestItems(TestItem [] TestItems) {
        this.TestItems = TestItems;
    }

    public ConnectTestResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConnectTestResult(ConnectTestResult source) {
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.IsPass != null) {
            this.IsPass = new Long(source.IsPass);
        }
        if (source.Addr != null) {
            this.Addr = new String(source.Addr);
        }
        if (source.SNatIp != null) {
            this.SNatIp = new String(source.SNatIp);
        }
        if (source.TestItems != null) {
            this.TestItems = new TestItem[source.TestItems.length];
            for (int i = 0; i < source.TestItems.length; i++) {
                this.TestItems[i] = new TestItem(source.TestItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamSimple(map, prefix + "Addr", this.Addr);
        this.setParamSimple(map, prefix + "SNatIp", this.SNatIp);
        this.setParamArrayObj(map, prefix + "TestItems.", this.TestItems);

    }
}

