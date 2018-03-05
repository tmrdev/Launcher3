// Generated by the protocol buffer compiler.  DO NOT EDIT!

package com.android.launcher3.userevent.nano;

@SuppressWarnings("hiding")
public interface LauncherLogProto {

  // enum ItemType
  public interface ItemType {
    public static final int DEFAULT_ITEMTYPE = 0;
    public static final int APP_ICON = 1;
    public static final int SHORTCUT = 2;
    public static final int WIDGET = 3;
    public static final int FOLDER_ICON = 4;
    public static final int DEEPSHORTCUT = 5;
    public static final int SEARCHBOX = 6;
    public static final int EDITTEXT = 7;
    public static final int NOTIFICATION = 8;
  }

  // enum ContainerType
  public interface ContainerType {
    public static final int DEFAULT_CONTAINERTYPE = 0;
    public static final int WORKSPACE = 1;
    public static final int HOTSEAT = 2;
    public static final int FOLDER = 3;
    public static final int ALLAPPS = 4;
    public static final int WIDGETS = 5;
    public static final int OVERVIEW = 6;
    public static final int PREDICTION = 7;
    public static final int SEARCHRESULT = 8;
    public static final int DEEPSHORTCUTS = 9;
    public static final int PINITEM = 10;
  }

  // enum ControlType
  public interface ControlType {
    public static final int DEFAULT_CONTROLTYPE = 0;
    public static final int ALL_APPS_BUTTON = 1;
    public static final int WIDGETS_BUTTON = 2;
    public static final int WALLPAPER_BUTTON = 3;
    public static final int SETTINGS_BUTTON = 4;
    public static final int REMOVE_TARGET = 5;
    public static final int UNINSTALL_TARGET = 6;
    public static final int APPINFO_TARGET = 7;
    public static final int RESIZE_HANDLE = 8;
    public static final int VERTICAL_SCROLL = 9;
    public static final int HOME_INTENT = 10;
    public static final int BACK_BUTTON = 11;
  }

  public static final class Target extends
      com.google.protobuf.nano.MessageNano {

    // enum Type
    public interface Type {
      public static final int NONE = 0;
      public static final int ITEM = 1;
      public static final int CONTROL = 2;
      public static final int CONTAINER = 3;
    }

    private static volatile Target[] _emptyArray;
    public static Target[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Target[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .userevent.Target.Type type = 1;
    public int type;

    // optional int32 page_index = 2;
    public int pageIndex;

    // optional int32 rank = 3;
    public int rank;

    // optional int32 grid_x = 4;
    public int gridX;

    // optional int32 grid_y = 5;
    public int gridY;

    // optional .userevent.ContainerType container_type = 6;
    public int containerType;

    // optional int32 cardinality = 7;
    public int cardinality;

    // optional .userevent.ControlType control_type = 8;
    public int controlType;

    // optional .userevent.ItemType item_type = 9;
    public int itemType;

    // optional int32 package_name_hash = 10;
    public int packageNameHash;

    // optional int32 component_hash = 11;
    public int componentHash;

    // optional int32 intent_hash = 12;
    public int intentHash;

    // optional int32 span_x = 13 [default = 1];
    public int spanX;

    // optional int32 span_y = 14 [default = 1];
    public int spanY;

    // optional int32 predictedRank = 15;
    public int predictedRank;

    // optional .userevent.TargetExtension extension = 16;
    public com.android.launcher3.userevent.nano.LauncherLogExtensions.TargetExtension extension;

    public Target() {
      clear();
    }

    public Target clear() {
      type = com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.NONE;
      pageIndex = 0;
      rank = 0;
      gridX = 0;
      gridY = 0;
      containerType = com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.DEFAULT_CONTAINERTYPE;
      cardinality = 0;
      controlType = com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.DEFAULT_CONTROLTYPE;
      itemType = com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.DEFAULT_ITEMTYPE;
      packageNameHash = 0;
      componentHash = 0;
      intentHash = 0;
      spanX = 1;
      spanY = 1;
      predictedRank = 0;
      extension = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.type != com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.NONE) {
        output.writeInt32(1, this.type);
      }
      if (this.pageIndex != 0) {
        output.writeInt32(2, this.pageIndex);
      }
      if (this.rank != 0) {
        output.writeInt32(3, this.rank);
      }
      if (this.gridX != 0) {
        output.writeInt32(4, this.gridX);
      }
      if (this.gridY != 0) {
        output.writeInt32(5, this.gridY);
      }
      if (this.containerType != com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.DEFAULT_CONTAINERTYPE) {
        output.writeInt32(6, this.containerType);
      }
      if (this.cardinality != 0) {
        output.writeInt32(7, this.cardinality);
      }
      if (this.controlType != com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.DEFAULT_CONTROLTYPE) {
        output.writeInt32(8, this.controlType);
      }
      if (this.itemType != com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.DEFAULT_ITEMTYPE) {
        output.writeInt32(9, this.itemType);
      }
      if (this.packageNameHash != 0) {
        output.writeInt32(10, this.packageNameHash);
      }
      if (this.componentHash != 0) {
        output.writeInt32(11, this.componentHash);
      }
      if (this.intentHash != 0) {
        output.writeInt32(12, this.intentHash);
      }
      if (this.spanX != 1) {
        output.writeInt32(13, this.spanX);
      }
      if (this.spanY != 1) {
        output.writeInt32(14, this.spanY);
      }
      if (this.predictedRank != 0) {
        output.writeInt32(15, this.predictedRank);
      }
      if (this.extension != null) {
        output.writeMessage(16, this.extension);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.type != com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.NONE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.type);
      }
      if (this.pageIndex != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(2, this.pageIndex);
      }
      if (this.rank != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(3, this.rank);
      }
      if (this.gridX != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(4, this.gridX);
      }
      if (this.gridY != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(5, this.gridY);
      }
      if (this.containerType != com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.DEFAULT_CONTAINERTYPE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(6, this.containerType);
      }
      if (this.cardinality != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(7, this.cardinality);
      }
      if (this.controlType != com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.DEFAULT_CONTROLTYPE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(8, this.controlType);
      }
      if (this.itemType != com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.DEFAULT_ITEMTYPE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(9, this.itemType);
      }
      if (this.packageNameHash != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(10, this.packageNameHash);
      }
      if (this.componentHash != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(11, this.componentHash);
      }
      if (this.intentHash != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(12, this.intentHash);
      }
      if (this.spanX != 1) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(13, this.spanX);
      }
      if (this.spanY != 1) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(14, this.spanY);
      }
      if (this.predictedRank != 0) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt32Size(15, this.predictedRank);
      }
      if (this.extension != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(16, this.extension);
      }
      return size;
    }

    @Override
    public Target mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.NONE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.ITEM:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.CONTROL:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Target.Type.CONTAINER:
                this.type = value;
                break;
            }
            break;
          }
          case 16: {
            this.pageIndex = input.readInt32();
            break;
          }
          case 24: {
            this.rank = input.readInt32();
            break;
          }
          case 32: {
            this.gridX = input.readInt32();
            break;
          }
          case 40: {
            this.gridY = input.readInt32();
            break;
          }
          case 48: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.DEFAULT_CONTAINERTYPE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.WORKSPACE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.HOTSEAT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.FOLDER:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.ALLAPPS:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.WIDGETS:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.OVERVIEW:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.PREDICTION:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.SEARCHRESULT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.DEEPSHORTCUTS:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ContainerType.PINITEM:
                this.containerType = value;
                break;
            }
            break;
          }
          case 56: {
            this.cardinality = input.readInt32();
            break;
          }
          case 64: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.DEFAULT_CONTROLTYPE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.ALL_APPS_BUTTON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.WIDGETS_BUTTON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.WALLPAPER_BUTTON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.SETTINGS_BUTTON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.REMOVE_TARGET:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.UNINSTALL_TARGET:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.APPINFO_TARGET:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.RESIZE_HANDLE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.VERTICAL_SCROLL:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.HOME_INTENT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ControlType.BACK_BUTTON:
                this.controlType = value;
                break;
            }
            break;
          }
          case 72: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.DEFAULT_ITEMTYPE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.APP_ICON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.SHORTCUT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.WIDGET:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.FOLDER_ICON:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.DEEPSHORTCUT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.SEARCHBOX:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.EDITTEXT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.ItemType.NOTIFICATION:
                this.itemType = value;
                break;
            }
            break;
          }
          case 80: {
            this.packageNameHash = input.readInt32();
            break;
          }
          case 88: {
            this.componentHash = input.readInt32();
            break;
          }
          case 96: {
            this.intentHash = input.readInt32();
            break;
          }
          case 104: {
            this.spanX = input.readInt32();
            break;
          }
          case 112: {
            this.spanY = input.readInt32();
            break;
          }
          case 120: {
            this.predictedRank = input.readInt32();
            break;
          }
          case 130: {
            if (this.extension == null) {
              this.extension = new com.android.launcher3.userevent.nano.LauncherLogExtensions.TargetExtension();
            }
            input.readMessage(this.extension);
            break;
          }
        }
      }
    }

    public static Target parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Target(), data);
    }

    public static Target parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Target().mergeFrom(input);
    }
  }

  public static final class Action extends
      com.google.protobuf.nano.MessageNano {

    // enum Type
    public interface Type {
      public static final int TOUCH = 0;
      public static final int AUTOMATED = 1;
      public static final int COMMAND = 2;
    }

    // enum Touch
    public interface Touch {
      public static final int TAP = 0;
      public static final int LONGPRESS = 1;
      public static final int DRAGDROP = 2;
      public static final int SWIPE = 3;
      public static final int FLING = 4;
      public static final int PINCH = 5;
    }

    // enum Direction
    public interface Direction {
      public static final int NONE = 0;
      public static final int UP = 1;
      public static final int DOWN = 2;
      public static final int LEFT = 3;
      public static final int RIGHT = 4;
    }

    // enum Command
    public interface Command {
      public static final int HOME_INTENT = 0;
      public static final int BACK = 1;
      public static final int ENTRY = 2;
      public static final int CANCEL = 3;
      public static final int CONFIRM = 4;
    }

    private static volatile Action[] _emptyArray;
    public static Action[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new Action[0];
          }
        }
      }
      return _emptyArray;
    }

    // optional .userevent.Action.Type type = 1;
    public int type;

    // optional .userevent.Action.Touch touch = 2;
    public int touch;

    // optional .userevent.Action.Direction dir = 3;
    public int dir;

    // optional .userevent.Action.Command command = 4;
    public int command;

    // optional bool is_outside = 5;
    public boolean isOutside;

    public Action() {
      clear();
    }

    public Action clear() {
      type = com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.TOUCH;
      touch = com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.TAP;
      dir = com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.NONE;
      command = com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.HOME_INTENT;
      isOutside = false;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.type != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.TOUCH) {
        output.writeInt32(1, this.type);
      }
      if (this.touch != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.TAP) {
        output.writeInt32(2, this.touch);
      }
      if (this.dir != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.NONE) {
        output.writeInt32(3, this.dir);
      }
      if (this.command != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.HOME_INTENT) {
        output.writeInt32(4, this.command);
      }
      if (this.isOutside != false) {
        output.writeBool(5, this.isOutside);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.type != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.TOUCH) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(1, this.type);
      }
      if (this.touch != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.TAP) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(2, this.touch);
      }
      if (this.dir != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.NONE) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(3, this.dir);
      }
      if (this.command != com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.HOME_INTENT) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeInt32Size(4, this.command);
      }
      if (this.isOutside != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(5, this.isOutside);
      }
      return size;
    }

    @Override
    public Action mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 8: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.TOUCH:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.AUTOMATED:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Type.COMMAND:
                this.type = value;
                break;
            }
            break;
          }
          case 16: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.TAP:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.LONGPRESS:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.DRAGDROP:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.SWIPE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.FLING:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Touch.PINCH:
                this.touch = value;
                break;
            }
            break;
          }
          case 24: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.NONE:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.UP:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.DOWN:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.LEFT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Direction.RIGHT:
                this.dir = value;
                break;
            }
            break;
          }
          case 32: {
            int value = input.readInt32();
            switch (value) {
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.HOME_INTENT:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.BACK:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.ENTRY:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.CANCEL:
              case com.android.launcher3.userevent.nano.LauncherLogProto.Action.Command.CONFIRM:
                this.command = value;
                break;
            }
            break;
          }
          case 40: {
            this.isOutside = input.readBool();
            break;
          }
        }
      }
    }

    public static Action parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new Action(), data);
    }

    public static Action parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new Action().mergeFrom(input);
    }
  }

  public static final class LauncherEvent extends
      com.google.protobuf.nano.MessageNano {

    private static volatile LauncherEvent[] _emptyArray;
    public static LauncherEvent[] emptyArray() {
      // Lazily initializes the empty array
      if (_emptyArray == null) {
        synchronized (
            com.google.protobuf.nano.InternalNano.LAZY_INIT_LOCK) {
          if (_emptyArray == null) {
            _emptyArray = new LauncherEvent[0];
          }
        }
      }
      return _emptyArray;
    }

    // required .userevent.Action action = 1;
    public com.android.launcher3.userevent.nano.LauncherLogProto.Action action;

    // repeated .userevent.Target src_target = 2;
    public com.android.launcher3.userevent.nano.LauncherLogProto.Target[] srcTarget;

    // repeated .userevent.Target dest_target = 3;
    public com.android.launcher3.userevent.nano.LauncherLogProto.Target[] destTarget;

    // optional int64 action_duration_millis = 4;
    public long actionDurationMillis;

    // optional int64 elapsed_container_millis = 5;
    public long elapsedContainerMillis;

    // optional int64 elapsed_session_millis = 6;
    public long elapsedSessionMillis;

    // optional bool is_in_multi_window_mode = 7;
    public boolean isInMultiWindowMode;

    // optional bool is_in_landscape_mode = 8;
    public boolean isInLandscapeMode;

    // optional .userevent.LauncherEventExtension extension = 9;
    public com.android.launcher3.userevent.nano.LauncherLogExtensions.LauncherEventExtension extension;

    public LauncherEvent() {
      clear();
    }

    public LauncherEvent clear() {
      action = null;
      srcTarget = com.android.launcher3.userevent.nano.LauncherLogProto.Target.emptyArray();
      destTarget = com.android.launcher3.userevent.nano.LauncherLogProto.Target.emptyArray();
      actionDurationMillis = 0L;
      elapsedContainerMillis = 0L;
      elapsedSessionMillis = 0L;
      isInMultiWindowMode = false;
      isInLandscapeMode = false;
      extension = null;
      cachedSize = -1;
      return this;
    }

    @Override
    public void writeTo(com.google.protobuf.nano.CodedOutputByteBufferNano output)
        throws java.io.IOException {
      if (this.action != null) {
        output.writeMessage(1, this.action);
      }
      if (this.srcTarget != null && this.srcTarget.length > 0) {
        for (int i = 0; i < this.srcTarget.length; i++) {
          com.android.launcher3.userevent.nano.LauncherLogProto.Target element = this.srcTarget[i];
          if (element != null) {
            output.writeMessage(2, element);
          }
        }
      }
      if (this.destTarget != null && this.destTarget.length > 0) {
        for (int i = 0; i < this.destTarget.length; i++) {
          com.android.launcher3.userevent.nano.LauncherLogProto.Target element = this.destTarget[i];
          if (element != null) {
            output.writeMessage(3, element);
          }
        }
      }
      if (this.actionDurationMillis != 0L) {
        output.writeInt64(4, this.actionDurationMillis);
      }
      if (this.elapsedContainerMillis != 0L) {
        output.writeInt64(5, this.elapsedContainerMillis);
      }
      if (this.elapsedSessionMillis != 0L) {
        output.writeInt64(6, this.elapsedSessionMillis);
      }
      if (this.isInMultiWindowMode != false) {
        output.writeBool(7, this.isInMultiWindowMode);
      }
      if (this.isInLandscapeMode != false) {
        output.writeBool(8, this.isInLandscapeMode);
      }
      if (this.extension != null) {
        output.writeMessage(9, this.extension);
      }
      super.writeTo(output);
    }

    @Override
    protected int computeSerializedSize() {
      int size = super.computeSerializedSize();
      if (this.action != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(1, this.action);
      }
      if (this.srcTarget != null && this.srcTarget.length > 0) {
        for (int i = 0; i < this.srcTarget.length; i++) {
          com.android.launcher3.userevent.nano.LauncherLogProto.Target element = this.srcTarget[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(2, element);
          }
        }
      }
      if (this.destTarget != null && this.destTarget.length > 0) {
        for (int i = 0; i < this.destTarget.length; i++) {
          com.android.launcher3.userevent.nano.LauncherLogProto.Target element = this.destTarget[i];
          if (element != null) {
            size += com.google.protobuf.nano.CodedOutputByteBufferNano
              .computeMessageSize(3, element);
          }
        }
      }
      if (this.actionDurationMillis != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(4, this.actionDurationMillis);
      }
      if (this.elapsedContainerMillis != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(5, this.elapsedContainerMillis);
      }
      if (this.elapsedSessionMillis != 0L) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeInt64Size(6, this.elapsedSessionMillis);
      }
      if (this.isInMultiWindowMode != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(7, this.isInMultiWindowMode);
      }
      if (this.isInLandscapeMode != false) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
            .computeBoolSize(8, this.isInLandscapeMode);
      }
      if (this.extension != null) {
        size += com.google.protobuf.nano.CodedOutputByteBufferNano
          .computeMessageSize(9, this.extension);
      }
      return size;
    }

    @Override
    public LauncherEvent mergeFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            return this;
          default: {
            if (!com.google.protobuf.nano.WireFormatNano.parseUnknownField(input, tag)) {
              return this;
            }
            break;
          }
          case 10: {
            if (this.action == null) {
              this.action = new com.android.launcher3.userevent.nano.LauncherLogProto.Action();
            }
            input.readMessage(this.action);
            break;
          }
          case 18: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 18);
            int i = this.srcTarget == null ? 0 : this.srcTarget.length;
            com.android.launcher3.userevent.nano.LauncherLogProto.Target[] newArray =
                new com.android.launcher3.userevent.nano.LauncherLogProto.Target[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.srcTarget, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.android.launcher3.userevent.nano.LauncherLogProto.Target();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.android.launcher3.userevent.nano.LauncherLogProto.Target();
            input.readMessage(newArray[i]);
            this.srcTarget = newArray;
            break;
          }
          case 26: {
            int arrayLength = com.google.protobuf.nano.WireFormatNano
                .getRepeatedFieldArrayLength(input, 26);
            int i = this.destTarget == null ? 0 : this.destTarget.length;
            com.android.launcher3.userevent.nano.LauncherLogProto.Target[] newArray =
                new com.android.launcher3.userevent.nano.LauncherLogProto.Target[i + arrayLength];
            if (i != 0) {
              java.lang.System.arraycopy(this.destTarget, 0, newArray, 0, i);
            }
            for (; i < newArray.length - 1; i++) {
              newArray[i] = new com.android.launcher3.userevent.nano.LauncherLogProto.Target();
              input.readMessage(newArray[i]);
              input.readTag();
            }
            // Last one without readTag.
            newArray[i] = new com.android.launcher3.userevent.nano.LauncherLogProto.Target();
            input.readMessage(newArray[i]);
            this.destTarget = newArray;
            break;
          }
          case 32: {
            this.actionDurationMillis = input.readInt64();
            break;
          }
          case 40: {
            this.elapsedContainerMillis = input.readInt64();
            break;
          }
          case 48: {
            this.elapsedSessionMillis = input.readInt64();
            break;
          }
          case 56: {
            this.isInMultiWindowMode = input.readBool();
            break;
          }
          case 64: {
            this.isInLandscapeMode = input.readBool();
            break;
          }
          case 74: {
            if (this.extension == null) {
              this.extension = new com.android.launcher3.userevent.nano.LauncherLogExtensions.LauncherEventExtension();
            }
            input.readMessage(this.extension);
            break;
          }
        }
      }
    }

    public static LauncherEvent parseFrom(byte[] data)
        throws com.google.protobuf.nano.InvalidProtocolBufferNanoException {
      return com.google.protobuf.nano.MessageNano.mergeFrom(new LauncherEvent(), data);
    }

    public static LauncherEvent parseFrom(
            com.google.protobuf.nano.CodedInputByteBufferNano input)
        throws java.io.IOException {
      return new LauncherEvent().mergeFrom(input);
    }
  }
}
