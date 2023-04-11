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
package com.tencentcloudapi.dasb.v20191018.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchFileBySidResult extends AbstractModel{

    /**
    * 文件操作时间
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
    */
    @SerializedName("Method")
    @Expose
    private Long Method;

    /**
    * 文件传输协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
    */
    @SerializedName("FileCurr")
    @Expose
    private String FileCurr;

    /**
    * method为重命名、移动文件时代表移动后的新位置.其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileNew")
    @Expose
    private String FileNew;

    /**
    * method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 堡垒机拦截情况, 1-已执行，  2-被阻断
    */
    @SerializedName("Action")
    @Expose
    private Long Action;

    /**
     * Get 文件操作时间 
     * @return Time 文件操作时间
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 文件操作时间
     * @param Time 文件操作时间
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹 
     * @return Method 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     */
    public Long getMethod() {
        return this.Method;
    }

    /**
     * Set 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     * @param Method 1-上传文件 2-下载文件 3-删除文件 4-移动文件 5-重命名文件 6-新建文件夹 7-移动文件夹 8-重命名文件夹 9-删除文件夹
     */
    public void setMethod(Long Method) {
        this.Method = Method;
    }

    /**
     * Get 文件传输协议 
     * @return Protocol 文件传输协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 文件传输协议
     * @param Protocol 文件传输协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置 
     * @return FileCurr method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     */
    public String getFileCurr() {
        return this.FileCurr;
    }

    /**
     * Set method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     * @param FileCurr method为上传、下载、删除时文件在服务器上的位置, 或重命名、移动文件前文件的位置
     */
    public void setFileCurr(String FileCurr) {
        this.FileCurr = FileCurr;
    }

    /**
     * Get method为重命名、移动文件时代表移动后的新位置.其他情况为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileNew method为重命名、移动文件时代表移动后的新位置.其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFileNew() {
        return this.FileNew;
    }

    /**
     * Set method为重命名、移动文件时代表移动后的新位置.其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileNew method为重命名、移动文件时代表移动后的新位置.其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileNew(String FileNew) {
        this.FileNew = FileNew;
    }

    /**
     * Get method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Size method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     * @param Size method为上传文件、下载文件、删除文件时显示文件大小。其他情况为null
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 堡垒机拦截情况, 1-已执行，  2-被阻断 
     * @return Action 堡垒机拦截情况, 1-已执行，  2-被阻断
     */
    public Long getAction() {
        return this.Action;
    }

    /**
     * Set 堡垒机拦截情况, 1-已执行，  2-被阻断
     * @param Action 堡垒机拦截情况, 1-已执行，  2-被阻断
     */
    public void setAction(Long Action) {
        this.Action = Action;
    }

    public SearchFileBySidResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchFileBySidResult(SearchFileBySidResult source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Method != null) {
            this.Method = new Long(source.Method);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.FileCurr != null) {
            this.FileCurr = new String(source.FileCurr);
        }
        if (source.FileNew != null) {
            this.FileNew = new String(source.FileNew);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Action != null) {
            this.Action = new Long(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "FileCurr", this.FileCurr);
        this.setParamSimple(map, prefix + "FileNew", this.FileNew);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

