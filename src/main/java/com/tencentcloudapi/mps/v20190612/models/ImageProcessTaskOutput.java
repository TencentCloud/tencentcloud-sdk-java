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
    * <p>输出文件的路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>输出文件的存储位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputStorage")
    @Expose
    private TaskOutputStorage OutputStorage;

    /**
    * <p>输出文件的URL。</p>
    */
    @SerializedName("SignedUrl")
    @Expose
    private String SignedUrl;

    /**
    * <p>图生文任务的处理结果。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>VOD标准版FileId</p>
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
     * Get <p>输出文件的路径。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>输出文件的路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>输出文件的路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>输出文件的路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>输出文件的存储位置。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputStorage <p>输出文件的存储位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskOutputStorage getOutputStorage() {
        return this.OutputStorage;
    }

    /**
     * Set <p>输出文件的存储位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputStorage <p>输出文件的存储位置。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputStorage(TaskOutputStorage OutputStorage) {
        this.OutputStorage = OutputStorage;
    }

    /**
     * Get <p>输出文件的URL。</p> 
     * @return SignedUrl <p>输出文件的URL。</p>
     */
    public String getSignedUrl() {
        return this.SignedUrl;
    }

    /**
     * Set <p>输出文件的URL。</p>
     * @param SignedUrl <p>输出文件的URL。</p>
     */
    public void setSignedUrl(String SignedUrl) {
        this.SignedUrl = SignedUrl;
    }

    /**
     * Get <p>图生文任务的处理结果。</p> 
     * @return Content <p>图生文任务的处理结果。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>图生文任务的处理结果。</p>
     * @param Content <p>图生文任务的处理结果。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>VOD标准版FileId</p> 
     * @return FileId <p>VOD标准版FileId</p>
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set <p>VOD标准版FileId</p>
     * @param FileId <p>VOD标准版FileId</p>
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
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
        if (source.FileId != null) {
            this.FileId = new String(source.FileId);
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
        this.setParamSimple(map, prefix + "FileId", this.FileId);

    }
}

