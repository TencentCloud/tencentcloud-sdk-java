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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageProcessTaskOutput extends AbstractModel {

    /**
    * 输出文件的路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 输出文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * 输出文件的URL。
    */
    @SerializedName("SignedUrl")
    @Expose
    private String SignedUrl;

    /**
    * 图生文任务的处理结果。
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 输出文件的路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path 输出文件的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 输出文件的路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path 输出文件的路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 输出文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage 输出文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set 输出文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage 输出文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get 输出文件的URL。 
     * @return SignedUrl 输出文件的URL。
     */
    public String getSignedUrl() {
        return this.SignedUrl;
    }

    /**
     * Set 输出文件的URL。
     * @param SignedUrl 输出文件的URL。
     */
    public void setSignedUrl(String SignedUrl) {
        this.SignedUrl = SignedUrl;
    }

    /**
     * Get 图生文任务的处理结果。 
     * @return Content 图生文任务的处理结果。
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 图生文任务的处理结果。
     * @param Content 图生文任务的处理结果。
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public ImageProcessTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageProcessTaskOutput(ImageProcessTaskOutput source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.OutputStorage != null) {
            this.OutputStorage = new TaskOutputStorage(source.OutputStorage);
        }
        if (source.SignedUrl != null) {
            this.SignedUrl = new String(source.SignedUrl);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamObj(map, prefix + "OutputStorage.", this.OutputStorage);
        this.setParamSimple(map, prefix + "SignedUrl", this.SignedUrl);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

