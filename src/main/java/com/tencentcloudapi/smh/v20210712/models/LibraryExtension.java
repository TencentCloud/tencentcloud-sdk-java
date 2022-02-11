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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LibraryExtension extends AbstractModel{

    /**
    * true 为文件类型媒体库，可存储任何类型文件；false 为媒体类型媒体库，仅可存储照片和视频类型文件。默认为 false。在媒体库创建后不能修改。
    */
    @SerializedName("IsFileLibrary")
    @Expose
    private Boolean IsFileLibrary;

    /**
    * true 为多租户空间媒体库，可创建多个租户空间；false 为单租户空间媒体库，不能创建租户空间，仅可使用默认的单一租户空间。默认为 false。在媒体库创建后不能修改。
    */
    @SerializedName("IsMultiSpace")
    @Expose
    private Boolean IsMultiSpace;

    /**
    * 保存至 COS 对象存储的文件的存储类型，仅支持 STANDARD、STANDARD_IA、INTELLIGENT_TIERING、MAZ_STANDARD、MAZ_STANDARD_IA 和 MAZ_INTELLIGENT_TIERING，默认为 STANDARD，当使用多 AZ 存储桶时将自动使用 MAZ_ 开头的用于多 AZ 的存储类型，否则自动使用非 MAZ_ 开头的用于非多 AZ 的存储类型。当指定智能分层存储 INTELLIGENT_TIERING 或 MAZ_INTELLIGENT_TIERING 时，需要事先为存储桶开启智能分层存储，否则将返回失败。在媒体库创建后不能修改。
    */
    @SerializedName("CosStorageClass")
    @Expose
    private String CosStorageClass;

    /**
    * 是否开启回收站功能。默认为 false。
    */
    @SerializedName("UseRecycleBin")
    @Expose
    private Boolean UseRecycleBin;

    /**
    * 当开启回收站时，自动删除回收站项目的天数，不能超过 1095（3 年），指定为 0 则不自动删除，默认为 0。当未开启回收站时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutoRemoveRecycledDays")
    @Expose
    private Long AutoRemoveRecycledDays;

    /**
    * 是否启用文件路径搜索功能。默认为 false。
    */
    @SerializedName("EnableSearch")
    @Expose
    private Boolean EnableSearch;

    /**
    * 设置媒体库或租户空间配额且配额小于已使用存储量时，是否拒绝设置请求。默认为 false。
    */
    @SerializedName("DenyOnQuotaLessThanUsage")
    @Expose
    private Boolean DenyOnQuotaLessThanUsage;

    /**
    * 是否开启历史版本。默认为 false。
    */
    @SerializedName("EnableFileHistory")
    @Expose
    private Boolean EnableFileHistory;

    /**
    * 当开启历史版本时，指定单个文件保留的历史版本的数量上限，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileHistoryCount")
    @Expose
    private Long FileHistoryCount;

    /**
    * 当开启历史版本时，指定历史版本保留的最长天数，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileHistoryExpireDay")
    @Expose
    private Long FileHistoryExpireDay;

    /**
    * 目录或文件名的最长长度，不能超过 255，默认为 255。修改该参数不会影响存量目录或文件名，即如果将该字段的值改小，已经存在的长度超过目标值的目录或文件名不会发生变化。
    */
    @SerializedName("MaxDirFileNameLength")
    @Expose
    private Long MaxDirFileNameLength;

    /**
    * 是否开启公有读，开启后读操作无需使用访问令牌，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublicRead")
    @Expose
    private Boolean IsPublicRead;

    /**
    * 媒体类型媒体库是否开启多相簿，开启后可创建一级目录（即相簿）且媒体文件只能保存在各相簿中，否则不能创建相簿且媒体文件只能保存在根目录。默认为 false。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。在媒体库创建后不能修改。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsMultiAlbum")
    @Expose
    private Boolean IsMultiAlbum;

    /**
    * 媒体类型媒体库是否允许上传照片，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowPhoto")
    @Expose
    private Boolean AllowPhoto;

    /**
    * 当媒体类型媒体库允许上传照片时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowPhotoExtName")
    @Expose
    private String [] AllowPhotoExtName;

    /**
    * 媒体类型媒体库是否允许上传视频，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowVideo")
    @Expose
    private Boolean AllowVideo;

    /**
    * 当媒体类型媒体库允许上传视频时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowVideoExtName")
    @Expose
    private String [] AllowVideoExtName;

    /**
    * 指定文件类型媒体库允许的文件扩展名，默认为空数组，此时允许上传所有类型文件。仅单租户空间文件类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AllowFileExtName")
    @Expose
    private String [] AllowFileExtName;

    /**
    * 照片上传时是否进行敏感内容鉴定，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecognizeSensitiveContent")
    @Expose
    private Boolean RecognizeSensitiveContent;

    /**
     * Get true 为文件类型媒体库，可存储任何类型文件；false 为媒体类型媒体库，仅可存储照片和视频类型文件。默认为 false。在媒体库创建后不能修改。 
     * @return IsFileLibrary true 为文件类型媒体库，可存储任何类型文件；false 为媒体类型媒体库，仅可存储照片和视频类型文件。默认为 false。在媒体库创建后不能修改。
     */
    public Boolean getIsFileLibrary() {
        return this.IsFileLibrary;
    }

    /**
     * Set true 为文件类型媒体库，可存储任何类型文件；false 为媒体类型媒体库，仅可存储照片和视频类型文件。默认为 false。在媒体库创建后不能修改。
     * @param IsFileLibrary true 为文件类型媒体库，可存储任何类型文件；false 为媒体类型媒体库，仅可存储照片和视频类型文件。默认为 false。在媒体库创建后不能修改。
     */
    public void setIsFileLibrary(Boolean IsFileLibrary) {
        this.IsFileLibrary = IsFileLibrary;
    }

    /**
     * Get true 为多租户空间媒体库，可创建多个租户空间；false 为单租户空间媒体库，不能创建租户空间，仅可使用默认的单一租户空间。默认为 false。在媒体库创建后不能修改。 
     * @return IsMultiSpace true 为多租户空间媒体库，可创建多个租户空间；false 为单租户空间媒体库，不能创建租户空间，仅可使用默认的单一租户空间。默认为 false。在媒体库创建后不能修改。
     */
    public Boolean getIsMultiSpace() {
        return this.IsMultiSpace;
    }

    /**
     * Set true 为多租户空间媒体库，可创建多个租户空间；false 为单租户空间媒体库，不能创建租户空间，仅可使用默认的单一租户空间。默认为 false。在媒体库创建后不能修改。
     * @param IsMultiSpace true 为多租户空间媒体库，可创建多个租户空间；false 为单租户空间媒体库，不能创建租户空间，仅可使用默认的单一租户空间。默认为 false。在媒体库创建后不能修改。
     */
    public void setIsMultiSpace(Boolean IsMultiSpace) {
        this.IsMultiSpace = IsMultiSpace;
    }

    /**
     * Get 保存至 COS 对象存储的文件的存储类型，仅支持 STANDARD、STANDARD_IA、INTELLIGENT_TIERING、MAZ_STANDARD、MAZ_STANDARD_IA 和 MAZ_INTELLIGENT_TIERING，默认为 STANDARD，当使用多 AZ 存储桶时将自动使用 MAZ_ 开头的用于多 AZ 的存储类型，否则自动使用非 MAZ_ 开头的用于非多 AZ 的存储类型。当指定智能分层存储 INTELLIGENT_TIERING 或 MAZ_INTELLIGENT_TIERING 时，需要事先为存储桶开启智能分层存储，否则将返回失败。在媒体库创建后不能修改。 
     * @return CosStorageClass 保存至 COS 对象存储的文件的存储类型，仅支持 STANDARD、STANDARD_IA、INTELLIGENT_TIERING、MAZ_STANDARD、MAZ_STANDARD_IA 和 MAZ_INTELLIGENT_TIERING，默认为 STANDARD，当使用多 AZ 存储桶时将自动使用 MAZ_ 开头的用于多 AZ 的存储类型，否则自动使用非 MAZ_ 开头的用于非多 AZ 的存储类型。当指定智能分层存储 INTELLIGENT_TIERING 或 MAZ_INTELLIGENT_TIERING 时，需要事先为存储桶开启智能分层存储，否则将返回失败。在媒体库创建后不能修改。
     */
    public String getCosStorageClass() {
        return this.CosStorageClass;
    }

    /**
     * Set 保存至 COS 对象存储的文件的存储类型，仅支持 STANDARD、STANDARD_IA、INTELLIGENT_TIERING、MAZ_STANDARD、MAZ_STANDARD_IA 和 MAZ_INTELLIGENT_TIERING，默认为 STANDARD，当使用多 AZ 存储桶时将自动使用 MAZ_ 开头的用于多 AZ 的存储类型，否则自动使用非 MAZ_ 开头的用于非多 AZ 的存储类型。当指定智能分层存储 INTELLIGENT_TIERING 或 MAZ_INTELLIGENT_TIERING 时，需要事先为存储桶开启智能分层存储，否则将返回失败。在媒体库创建后不能修改。
     * @param CosStorageClass 保存至 COS 对象存储的文件的存储类型，仅支持 STANDARD、STANDARD_IA、INTELLIGENT_TIERING、MAZ_STANDARD、MAZ_STANDARD_IA 和 MAZ_INTELLIGENT_TIERING，默认为 STANDARD，当使用多 AZ 存储桶时将自动使用 MAZ_ 开头的用于多 AZ 的存储类型，否则自动使用非 MAZ_ 开头的用于非多 AZ 的存储类型。当指定智能分层存储 INTELLIGENT_TIERING 或 MAZ_INTELLIGENT_TIERING 时，需要事先为存储桶开启智能分层存储，否则将返回失败。在媒体库创建后不能修改。
     */
    public void setCosStorageClass(String CosStorageClass) {
        this.CosStorageClass = CosStorageClass;
    }

    /**
     * Get 是否开启回收站功能。默认为 false。 
     * @return UseRecycleBin 是否开启回收站功能。默认为 false。
     */
    public Boolean getUseRecycleBin() {
        return this.UseRecycleBin;
    }

    /**
     * Set 是否开启回收站功能。默认为 false。
     * @param UseRecycleBin 是否开启回收站功能。默认为 false。
     */
    public void setUseRecycleBin(Boolean UseRecycleBin) {
        this.UseRecycleBin = UseRecycleBin;
    }

    /**
     * Get 当开启回收站时，自动删除回收站项目的天数，不能超过 1095（3 年），指定为 0 则不自动删除，默认为 0。当未开启回收站时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutoRemoveRecycledDays 当开启回收站时，自动删除回收站项目的天数，不能超过 1095（3 年），指定为 0 则不自动删除，默认为 0。当未开启回收站时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutoRemoveRecycledDays() {
        return this.AutoRemoveRecycledDays;
    }

    /**
     * Set 当开启回收站时，自动删除回收站项目的天数，不能超过 1095（3 年），指定为 0 则不自动删除，默认为 0。当未开启回收站时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutoRemoveRecycledDays 当开启回收站时，自动删除回收站项目的天数，不能超过 1095（3 年），指定为 0 则不自动删除，默认为 0。当未开启回收站时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutoRemoveRecycledDays(Long AutoRemoveRecycledDays) {
        this.AutoRemoveRecycledDays = AutoRemoveRecycledDays;
    }

    /**
     * Get 是否启用文件路径搜索功能。默认为 false。 
     * @return EnableSearch 是否启用文件路径搜索功能。默认为 false。
     */
    public Boolean getEnableSearch() {
        return this.EnableSearch;
    }

    /**
     * Set 是否启用文件路径搜索功能。默认为 false。
     * @param EnableSearch 是否启用文件路径搜索功能。默认为 false。
     */
    public void setEnableSearch(Boolean EnableSearch) {
        this.EnableSearch = EnableSearch;
    }

    /**
     * Get 设置媒体库或租户空间配额且配额小于已使用存储量时，是否拒绝设置请求。默认为 false。 
     * @return DenyOnQuotaLessThanUsage 设置媒体库或租户空间配额且配额小于已使用存储量时，是否拒绝设置请求。默认为 false。
     */
    public Boolean getDenyOnQuotaLessThanUsage() {
        return this.DenyOnQuotaLessThanUsage;
    }

    /**
     * Set 设置媒体库或租户空间配额且配额小于已使用存储量时，是否拒绝设置请求。默认为 false。
     * @param DenyOnQuotaLessThanUsage 设置媒体库或租户空间配额且配额小于已使用存储量时，是否拒绝设置请求。默认为 false。
     */
    public void setDenyOnQuotaLessThanUsage(Boolean DenyOnQuotaLessThanUsage) {
        this.DenyOnQuotaLessThanUsage = DenyOnQuotaLessThanUsage;
    }

    /**
     * Get 是否开启历史版本。默认为 false。 
     * @return EnableFileHistory 是否开启历史版本。默认为 false。
     */
    public Boolean getEnableFileHistory() {
        return this.EnableFileHistory;
    }

    /**
     * Set 是否开启历史版本。默认为 false。
     * @param EnableFileHistory 是否开启历史版本。默认为 false。
     */
    public void setEnableFileHistory(Boolean EnableFileHistory) {
        this.EnableFileHistory = EnableFileHistory;
    }

    /**
     * Get 当开启历史版本时，指定单个文件保留的历史版本的数量上限，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileHistoryCount 当开启历史版本时，指定单个文件保留的历史版本的数量上限，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileHistoryCount() {
        return this.FileHistoryCount;
    }

    /**
     * Set 当开启历史版本时，指定单个文件保留的历史版本的数量上限，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileHistoryCount 当开启历史版本时，指定单个文件保留的历史版本的数量上限，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileHistoryCount(Long FileHistoryCount) {
        this.FileHistoryCount = FileHistoryCount;
    }

    /**
     * Get 当开启历史版本时，指定历史版本保留的最长天数，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileHistoryExpireDay 当开启历史版本时，指定历史版本保留的最长天数，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileHistoryExpireDay() {
        return this.FileHistoryExpireDay;
    }

    /**
     * Set 当开启历史版本时，指定历史版本保留的最长天数，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileHistoryExpireDay 当开启历史版本时，指定历史版本保留的最长天数，不能超过 999，指定为 0 则不限制，默认为 0。当未开启历史版本时，该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileHistoryExpireDay(Long FileHistoryExpireDay) {
        this.FileHistoryExpireDay = FileHistoryExpireDay;
    }

    /**
     * Get 目录或文件名的最长长度，不能超过 255，默认为 255。修改该参数不会影响存量目录或文件名，即如果将该字段的值改小，已经存在的长度超过目标值的目录或文件名不会发生变化。 
     * @return MaxDirFileNameLength 目录或文件名的最长长度，不能超过 255，默认为 255。修改该参数不会影响存量目录或文件名，即如果将该字段的值改小，已经存在的长度超过目标值的目录或文件名不会发生变化。
     */
    public Long getMaxDirFileNameLength() {
        return this.MaxDirFileNameLength;
    }

    /**
     * Set 目录或文件名的最长长度，不能超过 255，默认为 255。修改该参数不会影响存量目录或文件名，即如果将该字段的值改小，已经存在的长度超过目标值的目录或文件名不会发生变化。
     * @param MaxDirFileNameLength 目录或文件名的最长长度，不能超过 255，默认为 255。修改该参数不会影响存量目录或文件名，即如果将该字段的值改小，已经存在的长度超过目标值的目录或文件名不会发生变化。
     */
    public void setMaxDirFileNameLength(Long MaxDirFileNameLength) {
        this.MaxDirFileNameLength = MaxDirFileNameLength;
    }

    /**
     * Get 是否开启公有读，开启后读操作无需使用访问令牌，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublicRead 是否开启公有读，开启后读操作无需使用访问令牌，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsPublicRead() {
        return this.IsPublicRead;
    }

    /**
     * Set 是否开启公有读，开启后读操作无需使用访问令牌，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublicRead 是否开启公有读，开启后读操作无需使用访问令牌，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublicRead(Boolean IsPublicRead) {
        this.IsPublicRead = IsPublicRead;
    }

    /**
     * Get 媒体类型媒体库是否开启多相簿，开启后可创建一级目录（即相簿）且媒体文件只能保存在各相簿中，否则不能创建相簿且媒体文件只能保存在根目录。默认为 false。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。在媒体库创建后不能修改。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsMultiAlbum 媒体类型媒体库是否开启多相簿，开启后可创建一级目录（即相簿）且媒体文件只能保存在各相簿中，否则不能创建相簿且媒体文件只能保存在根目录。默认为 false。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。在媒体库创建后不能修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsMultiAlbum() {
        return this.IsMultiAlbum;
    }

    /**
     * Set 媒体类型媒体库是否开启多相簿，开启后可创建一级目录（即相簿）且媒体文件只能保存在各相簿中，否则不能创建相簿且媒体文件只能保存在根目录。默认为 false。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。在媒体库创建后不能修改。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsMultiAlbum 媒体类型媒体库是否开启多相簿，开启后可创建一级目录（即相簿）且媒体文件只能保存在各相簿中，否则不能创建相簿且媒体文件只能保存在根目录。默认为 false。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。在媒体库创建后不能修改。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsMultiAlbum(Boolean IsMultiAlbum) {
        this.IsMultiAlbum = IsMultiAlbum;
    }

    /**
     * Get 媒体类型媒体库是否允许上传照片，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowPhoto 媒体类型媒体库是否允许上传照片，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowPhoto() {
        return this.AllowPhoto;
    }

    /**
     * Set 媒体类型媒体库是否允许上传照片，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowPhoto 媒体类型媒体库是否允许上传照片，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowPhoto(Boolean AllowPhoto) {
        this.AllowPhoto = AllowPhoto;
    }

    /**
     * Get 当媒体类型媒体库允许上传照片时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowPhotoExtName 当媒体类型媒体库允许上传照片时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowPhotoExtName() {
        return this.AllowPhotoExtName;
    }

    /**
     * Set 当媒体类型媒体库允许上传照片时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowPhotoExtName 当媒体类型媒体库允许上传照片时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowPhotoExtName(String [] AllowPhotoExtName) {
        this.AllowPhotoExtName = AllowPhotoExtName;
    }

    /**
     * Get 媒体类型媒体库是否允许上传视频，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowVideo 媒体类型媒体库是否允许上传视频，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getAllowVideo() {
        return this.AllowVideo;
    }

    /**
     * Set 媒体类型媒体库是否允许上传视频，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowVideo 媒体类型媒体库是否允许上传视频，默认为 true。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowVideo(Boolean AllowVideo) {
        this.AllowVideo = AllowVideo;
    }

    /**
     * Get 当媒体类型媒体库允许上传视频时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowVideoExtName 当媒体类型媒体库允许上传视频时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowVideoExtName() {
        return this.AllowVideoExtName;
    }

    /**
     * Set 当媒体类型媒体库允许上传视频时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowVideoExtName 当媒体类型媒体库允许上传视频时，指定允许的扩展名，默认为空数组，此时将根据文件扩展名对应的 MIME 类型自动判断。仅单租户空间媒体类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowVideoExtName(String [] AllowVideoExtName) {
        this.AllowVideoExtName = AllowVideoExtName;
    }

    /**
     * Get 指定文件类型媒体库允许的文件扩展名，默认为空数组，此时允许上传所有类型文件。仅单租户空间文件类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AllowFileExtName 指定文件类型媒体库允许的文件扩展名，默认为空数组，此时允许上传所有类型文件。仅单租户空间文件类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getAllowFileExtName() {
        return this.AllowFileExtName;
    }

    /**
     * Set 指定文件类型媒体库允许的文件扩展名，默认为空数组，此时允许上传所有类型文件。仅单租户空间文件类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AllowFileExtName 指定文件类型媒体库允许的文件扩展名，默认为空数组，此时允许上传所有类型文件。仅单租户空间文件类型媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAllowFileExtName(String [] AllowFileExtName) {
        this.AllowFileExtName = AllowFileExtName;
    }

    /**
     * Get 照片上传时是否进行敏感内容鉴定，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecognizeSensitiveContent 照片上传时是否进行敏感内容鉴定，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getRecognizeSensitiveContent() {
        return this.RecognizeSensitiveContent;
    }

    /**
     * Set 照片上传时是否进行敏感内容鉴定，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecognizeSensitiveContent 照片上传时是否进行敏感内容鉴定，默认为 false。仅单租户空间媒体库支持该属性，否则该属性为 null。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecognizeSensitiveContent(Boolean RecognizeSensitiveContent) {
        this.RecognizeSensitiveContent = RecognizeSensitiveContent;
    }

    public LibraryExtension() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LibraryExtension(LibraryExtension source) {
        if (source.IsFileLibrary != null) {
            this.IsFileLibrary = new Boolean(source.IsFileLibrary);
        }
        if (source.IsMultiSpace != null) {
            this.IsMultiSpace = new Boolean(source.IsMultiSpace);
        }
        if (source.CosStorageClass != null) {
            this.CosStorageClass = new String(source.CosStorageClass);
        }
        if (source.UseRecycleBin != null) {
            this.UseRecycleBin = new Boolean(source.UseRecycleBin);
        }
        if (source.AutoRemoveRecycledDays != null) {
            this.AutoRemoveRecycledDays = new Long(source.AutoRemoveRecycledDays);
        }
        if (source.EnableSearch != null) {
            this.EnableSearch = new Boolean(source.EnableSearch);
        }
        if (source.DenyOnQuotaLessThanUsage != null) {
            this.DenyOnQuotaLessThanUsage = new Boolean(source.DenyOnQuotaLessThanUsage);
        }
        if (source.EnableFileHistory != null) {
            this.EnableFileHistory = new Boolean(source.EnableFileHistory);
        }
        if (source.FileHistoryCount != null) {
            this.FileHistoryCount = new Long(source.FileHistoryCount);
        }
        if (source.FileHistoryExpireDay != null) {
            this.FileHistoryExpireDay = new Long(source.FileHistoryExpireDay);
        }
        if (source.MaxDirFileNameLength != null) {
            this.MaxDirFileNameLength = new Long(source.MaxDirFileNameLength);
        }
        if (source.IsPublicRead != null) {
            this.IsPublicRead = new Boolean(source.IsPublicRead);
        }
        if (source.IsMultiAlbum != null) {
            this.IsMultiAlbum = new Boolean(source.IsMultiAlbum);
        }
        if (source.AllowPhoto != null) {
            this.AllowPhoto = new Boolean(source.AllowPhoto);
        }
        if (source.AllowPhotoExtName != null) {
            this.AllowPhotoExtName = new String[source.AllowPhotoExtName.length];
            for (int i = 0; i < source.AllowPhotoExtName.length; i++) {
                this.AllowPhotoExtName[i] = new String(source.AllowPhotoExtName[i]);
            }
        }
        if (source.AllowVideo != null) {
            this.AllowVideo = new Boolean(source.AllowVideo);
        }
        if (source.AllowVideoExtName != null) {
            this.AllowVideoExtName = new String[source.AllowVideoExtName.length];
            for (int i = 0; i < source.AllowVideoExtName.length; i++) {
                this.AllowVideoExtName[i] = new String(source.AllowVideoExtName[i]);
            }
        }
        if (source.AllowFileExtName != null) {
            this.AllowFileExtName = new String[source.AllowFileExtName.length];
            for (int i = 0; i < source.AllowFileExtName.length; i++) {
                this.AllowFileExtName[i] = new String(source.AllowFileExtName[i]);
            }
        }
        if (source.RecognizeSensitiveContent != null) {
            this.RecognizeSensitiveContent = new Boolean(source.RecognizeSensitiveContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFileLibrary", this.IsFileLibrary);
        this.setParamSimple(map, prefix + "IsMultiSpace", this.IsMultiSpace);
        this.setParamSimple(map, prefix + "CosStorageClass", this.CosStorageClass);
        this.setParamSimple(map, prefix + "UseRecycleBin", this.UseRecycleBin);
        this.setParamSimple(map, prefix + "AutoRemoveRecycledDays", this.AutoRemoveRecycledDays);
        this.setParamSimple(map, prefix + "EnableSearch", this.EnableSearch);
        this.setParamSimple(map, prefix + "DenyOnQuotaLessThanUsage", this.DenyOnQuotaLessThanUsage);
        this.setParamSimple(map, prefix + "EnableFileHistory", this.EnableFileHistory);
        this.setParamSimple(map, prefix + "FileHistoryCount", this.FileHistoryCount);
        this.setParamSimple(map, prefix + "FileHistoryExpireDay", this.FileHistoryExpireDay);
        this.setParamSimple(map, prefix + "MaxDirFileNameLength", this.MaxDirFileNameLength);
        this.setParamSimple(map, prefix + "IsPublicRead", this.IsPublicRead);
        this.setParamSimple(map, prefix + "IsMultiAlbum", this.IsMultiAlbum);
        this.setParamSimple(map, prefix + "AllowPhoto", this.AllowPhoto);
        this.setParamArraySimple(map, prefix + "AllowPhotoExtName.", this.AllowPhotoExtName);
        this.setParamSimple(map, prefix + "AllowVideo", this.AllowVideo);
        this.setParamArraySimple(map, prefix + "AllowVideoExtName.", this.AllowVideoExtName);
        this.setParamArraySimple(map, prefix + "AllowFileExtName.", this.AllowFileExtName);
        this.setParamSimple(map, prefix + "RecognizeSensitiveContent", this.RecognizeSensitiveContent);

    }
}

