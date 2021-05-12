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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamConnectProjectInput extends AbstractModel{

    /**
    * 云转推主输入源信息。
    */
    @SerializedName("MainInput")
    @Expose
    private StreamInputInfo MainInput;

    /**
    * 云转推备输入源信息。
    */
    @SerializedName("BackupInput")
    @Expose
    private StreamInputInfo BackupInput;

    /**
    * 云转推输出源信息。
    */
    @SerializedName("Outputs")
    @Expose
    private StreamConnectOutput [] Outputs;

    /**
     * Get 云转推主输入源信息。 
     * @return MainInput 云转推主输入源信息。
     */
    public StreamInputInfo getMainInput() {
        return this.MainInput;
    }

    /**
     * Set 云转推主输入源信息。
     * @param MainInput 云转推主输入源信息。
     */
    public void setMainInput(StreamInputInfo MainInput) {
        this.MainInput = MainInput;
    }

    /**
     * Get 云转推备输入源信息。 
     * @return BackupInput 云转推备输入源信息。
     */
    public StreamInputInfo getBackupInput() {
        return this.BackupInput;
    }

    /**
     * Set 云转推备输入源信息。
     * @param BackupInput 云转推备输入源信息。
     */
    public void setBackupInput(StreamInputInfo BackupInput) {
        this.BackupInput = BackupInput;
    }

    /**
     * Get 云转推输出源信息。 
     * @return Outputs 云转推输出源信息。
     */
    public StreamConnectOutput [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 云转推输出源信息。
     * @param Outputs 云转推输出源信息。
     */
    public void setOutputs(StreamConnectOutput [] Outputs) {
        this.Outputs = Outputs;
    }

    public StreamConnectProjectInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StreamConnectProjectInput(StreamConnectProjectInput source) {
        if (source.MainInput != null) {
            this.MainInput = new StreamInputInfo(source.MainInput);
        }
        if (source.BackupInput != null) {
            this.BackupInput = new StreamInputInfo(source.BackupInput);
        }
        if (source.Outputs != null) {
            this.Outputs = new StreamConnectOutput[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new StreamConnectOutput(source.Outputs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MainInput.", this.MainInput);
        this.setParamObj(map, prefix + "BackupInput.", this.BackupInput);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);

    }
}

