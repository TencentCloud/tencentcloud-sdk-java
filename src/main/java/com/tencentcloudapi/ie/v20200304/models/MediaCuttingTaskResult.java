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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaCuttingTaskResult extends AbstractModel {

    /**
    * 如果ResultListType不为NoListFile时，结果（TaskResultFile）列表文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListFile")
    @Expose
    private TaskResultFile ListFile;

    /**
    * 结果个数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResultCount")
    @Expose
    private Long ResultCount;

    /**
    * 第一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FirstFile")
    @Expose
    private TaskResultFile FirstFile;

    /**
    * 最后一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastFile")
    @Expose
    private TaskResultFile LastFile;

    /**
    * 任务结果包含的图片总数。
静态图：总数即为文件数；
雪碧图：所有小图总数；
动图、视频：不计算图片数，为 0。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCount")
    @Expose
    private Long ImageCount;

    /**
     * Get 如果ResultListType不为NoListFile时，结果（TaskResultFile）列表文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListFile 如果ResultListType不为NoListFile时，结果（TaskResultFile）列表文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResultFile getListFile() {
        return this.ListFile;
    }

    /**
     * Set 如果ResultListType不为NoListFile时，结果（TaskResultFile）列表文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListFile 如果ResultListType不为NoListFile时，结果（TaskResultFile）列表文件的存储位置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListFile(TaskResultFile ListFile) {
        this.ListFile = ListFile;
    }

    /**
     * Get 结果个数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResultCount 结果个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResultCount() {
        return this.ResultCount;
    }

    /**
     * Set 结果个数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResultCount 结果个数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResultCount(Long ResultCount) {
        this.ResultCount = ResultCount;
    }

    /**
     * Get 第一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FirstFile 第一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResultFile getFirstFile() {
        return this.FirstFile;
    }

    /**
     * Set 第一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FirstFile 第一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFirstFile(TaskResultFile FirstFile) {
        this.FirstFile = FirstFile;
    }

    /**
     * Get 最后一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastFile 最后一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TaskResultFile getLastFile() {
        return this.LastFile;
    }

    /**
     * Set 最后一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastFile 最后一个结果文件。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastFile(TaskResultFile LastFile) {
        this.LastFile = LastFile;
    }

    /**
     * Get 任务结果包含的图片总数。
静态图：总数即为文件数；
雪碧图：所有小图总数；
动图、视频：不计算图片数，为 0。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCount 任务结果包含的图片总数。
静态图：总数即为文件数；
雪碧图：所有小图总数；
动图、视频：不计算图片数，为 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImageCount() {
        return this.ImageCount;
    }

    /**
     * Set 任务结果包含的图片总数。
静态图：总数即为文件数；
雪碧图：所有小图总数；
动图、视频：不计算图片数，为 0。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCount 任务结果包含的图片总数。
静态图：总数即为文件数；
雪碧图：所有小图总数；
动图、视频：不计算图片数，为 0。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCount(Long ImageCount) {
        this.ImageCount = ImageCount;
    }

    public MediaCuttingTaskResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaCuttingTaskResult(MediaCuttingTaskResult source) {
        if (source.ListFile != null) {
            this.ListFile = new TaskResultFile(source.ListFile);
        }
        if (source.ResultCount != null) {
            this.ResultCount = new Long(source.ResultCount);
        }
        if (source.FirstFile != null) {
            this.FirstFile = new TaskResultFile(source.FirstFile);
        }
        if (source.LastFile != null) {
            this.LastFile = new TaskResultFile(source.LastFile);
        }
        if (source.ImageCount != null) {
            this.ImageCount = new Long(source.ImageCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ListFile.", this.ListFile);
        this.setParamSimple(map, prefix + "ResultCount", this.ResultCount);
        this.setParamObj(map, prefix + "FirstFile.", this.FirstFile);
        this.setParamObj(map, prefix + "LastFile.", this.LastFile);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);

    }
}

