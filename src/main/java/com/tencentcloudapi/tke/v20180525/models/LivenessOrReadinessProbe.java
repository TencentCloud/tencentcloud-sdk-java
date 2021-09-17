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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivenessOrReadinessProbe extends AbstractModel{

    /**
    * 探针参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Probe")
    @Expose
    private Probe Probe;

    /**
    * HttpGet检测参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HttpGet")
    @Expose
    private HttpGet HttpGet;

    /**
    * 容器内检测命令参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Exec")
    @Expose
    private Exec Exec;

    /**
    * TcpSocket检测的端口参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TcpSocket")
    @Expose
    private TcpSocket TcpSocket;

    /**
     * Get 探针参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Probe 探针参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Probe getProbe() {
        return this.Probe;
    }

    /**
     * Set 探针参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Probe 探针参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProbe(Probe Probe) {
        this.Probe = Probe;
    }

    /**
     * Get HttpGet检测参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HttpGet HttpGet检测参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HttpGet getHttpGet() {
        return this.HttpGet;
    }

    /**
     * Set HttpGet检测参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param HttpGet HttpGet检测参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHttpGet(HttpGet HttpGet) {
        this.HttpGet = HttpGet;
    }

    /**
     * Get 容器内检测命令参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Exec 容器内检测命令参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Exec getExec() {
        return this.Exec;
    }

    /**
     * Set 容器内检测命令参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Exec 容器内检测命令参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExec(Exec Exec) {
        this.Exec = Exec;
    }

    /**
     * Get TcpSocket检测的端口参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TcpSocket TcpSocket检测的端口参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TcpSocket getTcpSocket() {
        return this.TcpSocket;
    }

    /**
     * Set TcpSocket检测的端口参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TcpSocket TcpSocket检测的端口参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTcpSocket(TcpSocket TcpSocket) {
        this.TcpSocket = TcpSocket;
    }

    public LivenessOrReadinessProbe() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LivenessOrReadinessProbe(LivenessOrReadinessProbe source) {
        if (source.Probe != null) {
            this.Probe = new Probe(source.Probe);
        }
        if (source.HttpGet != null) {
            this.HttpGet = new HttpGet(source.HttpGet);
        }
        if (source.Exec != null) {
            this.Exec = new Exec(source.Exec);
        }
        if (source.TcpSocket != null) {
            this.TcpSocket = new TcpSocket(source.TcpSocket);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Probe.", this.Probe);
        this.setParamObj(map, prefix + "HttpGet.", this.HttpGet);
        this.setParamObj(map, prefix + "Exec.", this.Exec);
        this.setParamObj(map, prefix + "TcpSocket.", this.TcpSocket);

    }
}

